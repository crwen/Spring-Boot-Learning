package me.crw.event;

/**
 * ClassName: EventMulticaster Description: date: 2020/7/18 11:09
 *
 * @author crwen
 * @create 2020-07-18-11:09
 * @since JDK 1.8
 */
public interface EventMulticaster {

	void multicaster(WeatherEvent event);

	void addListener(WeatherListener weatherListener);

	void removeListener(WeatherListener weatherListener);

}
