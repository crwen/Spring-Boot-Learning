package me.crw.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: AbstractEventMulticaster
 * Description:
 * date: 2020/7/18 11:10
 *
 * @author crwen
 * @create 2020-07-18-11:10
 * @since JDK 1.8
 */
@Component
public abstract class AbstractEventMulticaster implements EventMulticaster {

	@Autowired
	private List<WeatherListener> listenerList =new ArrayList<>();

	@Override
	public void multicaster(WeatherEvent event) {
		doStart();
		listenerList.forEach(i -> i.onWeatherEvent(event));
		doEnd();
	}

	@Override
	public void addListener(WeatherListener weatherListener) {
		listenerList.add(weatherListener);
	}

	@Override
	public void removeListener(WeatherListener weatherListener) {
		listenerList.remove(weatherListener);
	}

	abstract void doStart();

	abstract void doEnd();
}
