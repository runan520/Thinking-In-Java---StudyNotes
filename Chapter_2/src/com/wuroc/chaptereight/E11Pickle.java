//: E11Pickle.java

package com.wuroc.chaptereight;
import static com.wuroc.util.Print.*;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年9月11日
 * 
 * 
 */
class Pickle {
	Pickle(){
		print("Pickle()");
	}
}

class Sandwich2 extends PortableLunch{
	
	Bread b = new Bread();
	Cheese c = new Cheese();
	Lettuce l = new Lettuce();
	Pickle p = new Pickle();  
	
	Sandwich2() {
		print("Sandwich()");  //组合的对象先执行
	}
}
public class E11Pickle {
	public static void main(String[] args) {
		new Sandwich2();
	}
	

}

/*
Meal()
Lunch()
ProtableLunch()
Bread()
Cheese
Lettuce()
Pickle()
Sandwich()
 *///











