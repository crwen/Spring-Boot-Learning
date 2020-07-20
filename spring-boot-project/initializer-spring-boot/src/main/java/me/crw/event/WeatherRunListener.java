package me.crw.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName: WeatherRunListener
 * Description:
 * date: 2020/7/18 15:08
 *
 * @author crwen
 * @create 2020-07-18-15:08
 * @since JDK 1.8
 */
@Component
public class WeatherRunListener {

	@Autowired
	private WeatherEventMulticaster eventMulticaster;

	public void snow() {
		eventMulticaster.multicaster(new SnowEvent());
	}

	public void rain() {
		eventMulticaster.multicaster(new RainEvent());
	}

}
