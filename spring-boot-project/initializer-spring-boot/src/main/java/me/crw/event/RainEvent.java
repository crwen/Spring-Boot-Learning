package me.crw.event;

import org.springframework.stereotype.Component;

/**
 * ClassName: RainEvent Description: date: 2020/7/18 11:05
 *
 * @author crwen
 * @create 2020-07-18-11:05
 * @since JDK 1.8
 */
@Component
public class RainEvent extends WeatherEvent {

	@Override
	public String getWeather() {
		return "rain";
	}

}
