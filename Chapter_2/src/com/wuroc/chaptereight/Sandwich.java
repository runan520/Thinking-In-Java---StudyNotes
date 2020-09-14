//: Sandwich.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年8月20日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Meal {
	Meal(){
		System.out.println("Meal()");
	}
	
}
class Bread{
	Bread(){
		System.out.println("Bread()");
	}
}
class Cheese{
	Cheese(){
		System.out.println("Cheese");
	}
}
class Lettuce{
	Lettuce(){
		System.out.println("Lettuce()");
	}
}
class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch()");
	}
}
class PortableLunch extends Lunch {
	PortableLunch(){
		System.out.println("ProtableLunch()");
	}
	
}
//这里先进行导出类的构造器的初始化
public class Sandwich  extends PortableLunch {
	public Sandwich() {
		System.out.println("Sandwich()");
	}
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	
//	public Sandwich() {
//		System.out.println("Sandwish()");
//	}
	public static void main(String[] args) {
		new Sandwich();
	}

}
//组合与继承以及多态的作用
/* Output:
Meal()
Lunch()
ProtableLunch()
Bread()
Cheese
Lettuce()
Sandwich()
 *///





