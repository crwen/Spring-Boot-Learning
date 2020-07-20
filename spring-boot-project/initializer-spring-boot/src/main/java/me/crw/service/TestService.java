package me.crw.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * ClassName: TestService
 * Description:
 * date: 2020/7/15 17:43
 *
 * @author crwen
 * @create 2020-07-15-17:43
 * @since JDK 1.8
 */
@Service
public class TestService implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public String test1() {
		return applicationContext.getEnvironment().getProperty("key1");
	}

	public String test2() {
		return applicationContext.getEnvironment().getProperty("key2");
	}

	public String test3() {
		return applicationContext.getEnvironment().getProperty("key3");
	}
}
