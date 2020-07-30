package me.crw.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: FirstInitializer Description: date: 2020/7/14 19:50
 *
 * @author crwen
 * @create 2020-07-14-19:50
 * @since JDK 1.8
 */

@Order(2)
public class SecondInitializer
		implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		Map<String, Object> map = new HashMap<>();
		map.put("key2", "value2");
		MapPropertySource mapPropertySource = new MapPropertySource("secondInitializer",
				map);
		environment.getPropertySources().addLast(mapPropertySource);
		System.out.println("run secondInitializer");
	}

}
