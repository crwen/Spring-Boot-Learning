package top.crwenassert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
public class PropertyApplication {
	public static void main(String[] args) {
		//new SpringApplication().run(PropertyApplication.class, args);
		SpringApplication springApplication = new SpringApplication(PropertyApplication.class);
		Properties properties = new Properties();
		properties.setProperty("blog.crwenassert.me", "blog_1");
		springApplication.setDefaultProperties(properties);
		springApplication.run(args);
	}
}
