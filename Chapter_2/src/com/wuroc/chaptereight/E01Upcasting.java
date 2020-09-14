//: E01Upcasting.java

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
public class E01Upcasting {
	public static void ride(Cycle c) {}
	public static void main(String args[]) {
		ride(new Cycle());
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());
		
	}
	


}
