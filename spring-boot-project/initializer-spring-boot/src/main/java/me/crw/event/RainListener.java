package me.crw.event;

import org.springframework.stereotype.Component;

/**
 * ClassName: RainListener
 * Description:
 * date: 2020/7/18 11:07
 *
 * @author crwen
 * @create 2020-07-18-11:07
 * @since JDK 1.8
 */
@Component
public class RainListener implements WeatherListener {
	@Override
	public void onWeatherEvent(WeatherEvent event) {
		if (event instanceof RainEvent) {
			System.out.println("hello " + event.getWeather());
		}
	}
}
