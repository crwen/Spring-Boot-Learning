package me.crw;

import org.springframework.util.StopWatch;

/**
 * ClassName: Main Description: date: 2020/7/30 22:04
 *
 * @author crwen
 * @create 2020-07-30-22:04
 * @since JDK 1.8
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// ConfigurationMetadataAnnotationProcessor demo = new
		// ConfigurationMetadataAnnotationProcessor();
		StopWatch stopWatch = new StopWatch("myTask");
		stopWatch.start("task1");
		Thread.sleep(2000L);
		stopWatch.stop();
		stopWatch.start("task2");
		Thread.sleep(3000L);
		stopWatch.stop();
		stopWatch.start("task3");
		Thread.sleep(1000L);
		stopWatch.stop();
		System.out.println(stopWatch.prettyPrint());
	}

}
