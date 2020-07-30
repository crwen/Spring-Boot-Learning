package me.crw.ioc.anno;

import me.crw.ioc.xml.Bird;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ClassName: MyBeanImport Description: date: 2020/7/19 19:36
 *
 * @author crwen
 * @create 2020-07-19-19:36
 * @since JDK 1.8
 */
public class MyBeanImport implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
			BeanDefinitionRegistry registry) {
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
		rootBeanDefinition.setBeanClass(Bird.class);
		registry.registerBeanDefinition("bird", rootBeanDefinition);

	}

}
