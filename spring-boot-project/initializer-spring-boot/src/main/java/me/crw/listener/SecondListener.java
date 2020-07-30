package me.crw.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * ClassName: SecondListener Description: date: 2020/7/18 20:07
 *
 * @author crwen
 * @create 2020-07-18-20:07
 * @since JDK 1.8
 */
public class SecondListener
		implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		System.out.println("listenint envirnoment prepared event......");
	}

}
