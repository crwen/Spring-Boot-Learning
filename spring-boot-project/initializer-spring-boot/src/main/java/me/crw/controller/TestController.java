package me.crw.controller;

import me.crw.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: TestController
 * Description:
 * date: 2020/7/15 17:42
 *
 * @author crwen
 * @create 2020-07-15-17:42
 * @since JDK 1.8
 */
@RestController
public class TestController {


	@GetMapping("/hello")
	public String hello() {
		return "hello springboot";
	}

	@Autowired
	private TestService testService;

	@GetMapping("/test1")
	public String test1() {
		return testService.test1();
	}

	@GetMapping("/test2")
	public String test2() {
		return testService.test2();
	}

	@GetMapping("/test3")
	public String test3() {
		return testService.test3();
	}



}
