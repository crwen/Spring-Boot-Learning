package me.crw.service;

import me.crw.ioc.xml.Animal;
import me.crw.ioc.xml.Student;
import org.springframework.stereotype.Controller;

/**
 * ClassName: HelloService
 * Description:
 * date: 2020/7/19 17:00
 *
 * @author crwen
 * @create 2020-07-19-17:00
 * @since JDK 1.8
 */
@Controller
public class HelloService {

	private Student student;

	private Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String hello() {
		return "hello";
		//return animal.getName();
	}
}
