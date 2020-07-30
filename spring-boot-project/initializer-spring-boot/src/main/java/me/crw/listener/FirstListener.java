package me.crw.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * ClassName: FirstListener Description: date: 2020/7/18 20:03
 *
 * @author crwen
 * @create 2020-07-18-20:03
 * @since JDK 1.8
 */
public class FirstListener implements ApplicationListener<ApplicationStartingEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("listening starting......");
	}

}
