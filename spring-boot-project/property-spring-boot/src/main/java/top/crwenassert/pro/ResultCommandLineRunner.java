package top.crwenassert.pro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * ClassName: ResultCommandLineRunner
 * Description:
 * date: 2020/8/1 22:23
 *
 * @author crwen
 * @create 2020-08-01-22:23
 * @since JDK 1.8
 */
@Component
public class ResultCommandLineRunner implements
		CommandLineRunner, EnvironmentAware {

	private Environment environment;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(environment.getProperty("url"));
		System.out.println(environment.getProperty("age"));
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
}
