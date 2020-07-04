//: Literals.java

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
public class Literals {
	
	
	public static void main(String[] args) {
		
		int i1 = 0x2f;  // Hexadecimal (lowercase)
		
		print("i1: " + Integer.toBinaryString(i1));
		
		int i2 = 0x2F; // Hexadecimal (uppercase)
		
		print("i2:" + Integer.toBinaryString(i2));
		
		int i3 = 0177; //Octal (leading zero)
		
		print("i3:" + Integer.toBinaryString(i3));
		
		char c = 0xffff; // max char hex value
		
		print("c: " + Integer.toBinaryString(c));
		
		byte b = 0x7f; //max byte hex value
		
		print("b: " + Integer.toBinaryString(b));
		
		short s = 0x7fff; //max byte hex value
		
		print("s: " + Integer.toBinaryString(s));
		
		long n1 = 200L; //long suffix
		
		print("n1: " + n1);
		
		long n2 = 200L;
		
		print("n2: " + n2);
		
		long n3 = 200;
		
		print("n3: " + n3);
		
		float f1 = 1;
		
		print("f1: " + f1);
		
		float f2 = 1F;
		
		print("f2: " + f2);
		
		float f3 = 1f;
		
		print("f3: " + f3);
		
		double d1 = 1d;
		
		print("d1: " + d1);
		
		double d2 = 1D;
		
		print("d2: " + d2); //(Hex and Octal also with long) 
		
	
		
	}
	
	

}/* Output:
i1: 101111
i2:101111
i3:1111111
c: 1111111111111111
b: 1111111
s: 111111111111111
n1: 200
n2: 200
n3: 200
f1: 1.0
f2: 1.0
f3: 1.0
d1: 1.0
d2: 1.0
*///
