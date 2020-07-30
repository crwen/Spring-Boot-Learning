package me.crw.event;

import org.springframework.stereotype.Component;

/**
 * ClassName: SnowListener Description: date: 2020/7/18 11:06
 *
 * @author crwen
 * @create 2020-07-18-11:06
 * @since JDK 1.8
 */
@Component
public class SnowListener implements WeatherListener {

	@Override
	public void onWeatherEvent(WeatherEvent event) {
		if (event instanceof SnowEvent) {
			System.out.println("hello " + event.getWeather());
		}
	}

}
