package me.crw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: InitializerApplication
 * Description:
 * date: 2020/7/15 17:41
 *
 * @author crwen
 * @create 2020-07-15-17:41
 * @since JDK 1.8
 */
@SpringBootApplication
public class InitializerApplication {
	public static void main(String[] args) {
		SpringApplication.run(InitializerApplication.class, args);
		//SpringApplication springApplication = new SpringApplication(InitializerApplication.class);
		//springApplication.addListeners(new SecondListener());
		//springApplication.addInitializers(new SecondInitializer());
		//springApplication.run(args);
	}
}
