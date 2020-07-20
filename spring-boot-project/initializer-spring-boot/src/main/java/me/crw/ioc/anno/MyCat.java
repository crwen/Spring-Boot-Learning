package me.crw.ioc.anno;

import me.crw.ioc.xml.Animal;
import me.crw.ioc.xml.Cat;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyCat
 * Description:
 * date: 2020/7/19 19:30
 *
 * @author crwen
 * @create 2020-07-19-19:30
 * @since JDK 1.8
 */
@Component
public class MyCat implements FactoryBean<Animal> {
	@Override
	public Animal getObject() throws Exception {
		return new Cat();
	}

	@Override
	public Class<?> getObjectType() {
		return Animal.class;
	}
}
