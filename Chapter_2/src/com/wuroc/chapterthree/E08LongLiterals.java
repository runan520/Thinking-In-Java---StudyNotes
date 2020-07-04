//: E08LongLiterals.java

package com.wuroc.chapterthree;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月2日
 *
 * 
 */
public class E08LongLiterals {
	
	public static void main(String[] args) {
		long L1 = 0x2f;
		
		print("L1: " + Long.toBinaryString(L1));
		
		long L2 = 0x2F;
		
		print("L2: " + Long.toBinaryString(L2));
		
		long L3 = 0177;
		
		print("L3: " + Long.toBinaryString(L3));
		
		
	}

}/* Output
L1: 101111
L2: 101111
L3: 1111111
*///:~
