package me.crw.event;

import org.springframework.stereotype.Component;

/**
 * ClassName: WeatherEventMulticaster
 * Description:
 * date: 2020/7/18 11:13
 *
 * @author crwen
 * @create 2020-07-18-11:13
 * @since JDK 1.8
 */
@Component
public class WeatherEventMulticaster extends AbstractEventMulticaster {
	@Override
	void doStart() {
		System.out.println("begin broadcast weather event");
	}

	@Override
	void doEnd() {
		System.out.println("end broadcast weather event");

	}
}
