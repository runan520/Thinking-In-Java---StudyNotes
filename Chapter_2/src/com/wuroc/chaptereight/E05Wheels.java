//: E05Wheels.java

package com.wuroc.chaptereight;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月23日
 * 
 * 
 */
public class E05Wheels {
	public static void ride(Cycle c) {
		System.out.println("Num. of wheels:" + c.wheels());
	}
	public static void main(String[] args) {
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());
	}

}
