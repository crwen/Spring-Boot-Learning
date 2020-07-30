package me.crw.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;

/**
 * ClassName: ForthListener Description: date: 2020/7/18 20:15
 *
 * @author crwen
 * @create 2020-07-18-20:15
 * @since JDK 1.8
 */
public class ForthListener implements SmartApplicationListener {

	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		return ApplicationStartedEvent.class.isAssignableFrom(eventType)
				|| ApplicationPreparedEvent.class.isAssignableFrom(eventType);
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("hello listener...");
	}

}
