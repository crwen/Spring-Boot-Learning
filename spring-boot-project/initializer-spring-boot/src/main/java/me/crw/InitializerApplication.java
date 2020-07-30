package me.crw;

import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

/**
 * ClassName: InitializerApplication Description: date: 2020/7/15 17:41
 *
 * @author crwen
 * @create 2020-07-15-17:41
 * @since JDK 1.8
 */
// @Conditional({WindowsCondition.class})
@SpringBootApplication
public class InitializerApplication {

	public static void main(String[] args) {
		// SpringApplication.run(InitializerApplication.class, args);
		SpringApplication springApplication = new SpringApplication(
				InitializerApplication.class);
		// springApplication.addListeners(new SecondListener());
		// springApplication.addInitializers(new SecondInitializer());
		// springApplication.setBanner(new ImageBanner(new
		// ClassPathResource("banner.gif")));
		springApplication
				.setBanner(new ResourceBanner(new ClassPathResource("banner_bak.txt")));
		springApplication.run(args);
	}

}
