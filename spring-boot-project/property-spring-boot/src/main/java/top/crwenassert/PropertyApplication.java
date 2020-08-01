package top.crwenassert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.util.Properties;

/**
 * ClassName: PropertyApplication
 * Description:
 * date: 2020/8/1 22:15
 *
 * @author crwen
 * @create 2020-08-01-22:15
 * @since JDK 1.8
 */
@SpringBootApplication
@PropertySource("pro/demo.properties")
public class PropertyApplication {
	public static void main(String[] args) {
		//new SpringApplication().run(PropertyApplication.class, args);
		SpringApplication springApplication = new SpringApplication(PropertyApplication.class);
		Properties properties = new Properties();
		properties.setProperty("url", "www.baidu.com");
		springApplication.setDefaultProperties(properties);
		springApplication.run(args);
	}
}
