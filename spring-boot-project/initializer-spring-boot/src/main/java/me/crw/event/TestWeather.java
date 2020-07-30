package me.crw.event;

/**
 * ClassName: TestWeather Description: date: 2020/7/18 11:14
 *
 * @author crwen
 * @create 2020-07-18-11:14
 * @since JDK 1.8
 */
public class TestWeather {

	public static void main(String[] args) {
		WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
		RainListener rainListener = new RainListener();
		SnowListener snowListener = new SnowListener();
		eventMulticaster.addListener(rainListener);
		eventMulticaster.addListener(snowListener);

		eventMulticaster.multicaster(new SnowEvent());
		eventMulticaster.multicaster(new RainEvent());
		eventMulticaster.removeListener(rainListener);
		eventMulticaster.multicaster(new SnowEvent());
		eventMulticaster.multicaster(new RainEvent());
	}

}
