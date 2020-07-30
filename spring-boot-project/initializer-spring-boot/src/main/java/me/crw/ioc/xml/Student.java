package me.crw.ioc.xml;

import java.util.List;

/**
 * ClassName: Student Description: date: 2020/7/19 16:56
 *
 * @author crwen
 * @create 2020-07-19-16:56
 * @since JDK 1.8
 */

public class Student {

	private String name;

	private Integer age;

	private List<String> classList;

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<String> getClassList() {
		return classList;
	}

	public void setClassList(List<String> classList) {
		this.classList = classList;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age + ", classList=["
				+ String.join(",", classList) + "]}";
	}

}
