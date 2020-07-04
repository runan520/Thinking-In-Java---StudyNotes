//: Casting.java

package com.wuroc.chapterthree;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月4日
 *
 * 
 */
public class Casting {
	
	public static void main(String[] args) {
		int i = 200;
		
		long lng = (long)i;
		
		lng = i;
		
		long lng2 = (long)200;
		
		lng2 = 200;
		//A "narrowing conversion":
		//Type mismatch: 
		//cannot convert from long to int
		i = (int) lng2; //Cast required
			
	}

}
