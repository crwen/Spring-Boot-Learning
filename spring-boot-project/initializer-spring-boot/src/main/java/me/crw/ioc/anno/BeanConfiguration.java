package me.crw.ioc.anno;

import me.crw.ioc.xml.Animal;
import me.crw.ioc.xml.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: BeanConfiguration
 * Description:
 * date: 2020/7/19 18:03
 *
 * @author crwen
 * @create 2020-07-19-18:03
 * @since JDK 1.8
 */
@Configuration
public class BeanConfiguration {

	@Bean("dog")
	Animal getDog() {
		return new Dog();
	}
}
