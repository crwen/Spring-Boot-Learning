package me.crw.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName: FirstCommandlineRunner
 * Description:
 * date: 2020/7/31 8:30
 *
 * @author crwen
 * @create 2020-07-31-8:30
 * @since JDK 1.8
 */
@Component
@Order(1)
public class FirstCommandlineRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("\u001B[32m >>startup first commandline runner<<<");
	}
}
