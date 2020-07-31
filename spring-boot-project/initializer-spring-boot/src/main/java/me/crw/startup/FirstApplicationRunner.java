package me.crw.startup;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName: FirstApplicationRunner
 * Description:
 * date: 2020/7/31 8:35
 *
 * @author crwen
 * @create 2020-07-31-8:35
 * @since JDK 1.8
 */
@Component
@Order(1)
public class FirstApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\u001B[32m >>startup first application runner<<<");
	}
}
