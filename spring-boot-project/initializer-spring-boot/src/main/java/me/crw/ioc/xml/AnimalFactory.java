package me.crw.ioc.xml;

/**
 * ClassName: AnimalFactory
 * Description:
 * date: 2020/7/19 17:12
 *
 * @author crwen
 * @create 2020-07-19-17:12
 * @since JDK 1.8
 */
public class AnimalFactory {

	//public static Animal getAnimal(String type) {
	//	if ("dog".equals(type)) {
	//		return new Dog();
	//	} else {
	//		return new Cat();
	//	}
	//}

	public Animal getAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}
}
