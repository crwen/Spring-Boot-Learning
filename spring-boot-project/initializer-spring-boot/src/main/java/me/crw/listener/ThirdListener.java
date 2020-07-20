package me.crw.listener;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;

/**
 * ClassName: ThirdListener
 * Description:
 * date: 2020/7/18 20:09
 *
 * @author crwen
 * @create 2020-07-18-20:09
 * @since JDK 1.8
 */
public class ThirdListener implements ApplicationListener<ApplicationContextInitializedEvent> {
	@Override
	public void onApplicationEvent(ApplicationContextInitializedEvent event) {
		System.out.println("listening application context initialized event......");
	}
}
