package me.crw;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * ClassName: WindowCondition
 * Description:
 * date: 2020/7/24 16:11
 *
 * @author crwen
 * @create 2020-07-24-16:11
 * @since JDK 1.8
 */
public class WindowsCondition implements Condition {

    // ConditionContext：判断条件，能使用的上下文环境
    // AnnotatedTypeMetadata：注释信息
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取 beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        // 获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        // 获取当前环境信息
        Environment environment = context.getEnvironment();
        // 获取 bean 定义的注册类
        //BeanDefinitionRegistry registry = context.getRegistry();

        String property = environment.getProperty("os.name");
        return property.contains("Windows") ? true : false;

    }
}
