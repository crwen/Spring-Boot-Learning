package me.crw.event;

import org.springframework.stereotype.Component;

/**
 * ClassName: WeatherEvent
 * Description:
 * date: 2020/7/18 11:04
 *
 * @author crwen
 * @create 2020-07-18-11:04
 * @since JDK 1.8
 */
@Component
public abstract class WeatherEvent {

	public abstract String getWeather();

}
