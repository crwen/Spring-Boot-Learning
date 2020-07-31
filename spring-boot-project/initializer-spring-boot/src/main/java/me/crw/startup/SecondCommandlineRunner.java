package me.crw.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName: SecondCommandlineRunner
 * Description:
 * date: 2020/7/31 8:33
 *
 * @author crwen
 * @create 2020-07-31-8:33
 * @since JDK 1.8
 */
@Component
@Order(2)
public class SecondCommandlineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\u001B[32m >>startup second commandline runner<<<");
	}
}
