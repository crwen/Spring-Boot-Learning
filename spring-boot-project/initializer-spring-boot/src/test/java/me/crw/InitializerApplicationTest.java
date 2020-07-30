package me.crw;

import me.crw.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * ClassName: InitializerApplicationTest Description: date: 2020/7/25 9:13
 *
 * @author crwen
 * @create 2020-07-25-9:13
 * @since JDK 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InitializerApplicationTest {

	@Autowired
	private HelloService helloService;

	@Test
	public void test() {
		System.out.println(helloService.hello());
	}

}