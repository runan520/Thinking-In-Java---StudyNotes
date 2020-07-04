//: CastingNumbers.java

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
public class CastingNumbers {
	
	public static void main(String[] args) {
		//float与double转型为整数值，对数字进行截尾
		double above = 0.7, below = 0.4;
		
		float fabove = 0.7f, fbelow = 0.4f;
		
		print("(int)above: " +(int)above);
		
		print("(int)below: " + (int)below);
		
		print("(int)fabove: " +(int)fabove);
		
		print("(int)fbelow: " + (int)fbelow);
		
	}

}
/*Output:
(int)above: 0
(int)below: 0
(int)fabove: 0
(int)fbelow: 0
*/// :~
