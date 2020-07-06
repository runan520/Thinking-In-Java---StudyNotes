//: E05Bitwiseoperators.java

package com.wuroc.chapterfour;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月2日
 *
 * 
 */
public class E05Bitwiseoperators {
	
	public static void main(String[] args) {
		
		int i1 = 0xaaaaaaaa;
		int i2 = 0x55555555;
		
		printnb("i1 = " );
		toBinaryString(i1);
		
		printnb("i2 = ");
		toBinaryString(i2);
		
		printnb("~i1 = ");
		toBinaryString(~i1);
		
		printnb("~i2 = ");
		toBinaryString(~i2);
		
		printnb("i1 & i1= ");
		toBinaryString(i1 & i1);
		
		printnb("i1 | i1= ");
		toBinaryString(i1 | i1);
		
		printnb("i1 ^ i1= ");
		toBinaryString(i1 ^ i1);
		
		
		printnb("i1 & i2 ");
		toBinaryString(i1 & i2);
		
		printnb("i1 | i2 ");
		toBinaryString(i1 | i2);
		
		printnb("i1 ^ i2 " );
		toBinaryString(i1 ^ i2);
	}

	/**
	 * @param i
	 * @return
	 */
	private static void toBinaryString(int i) {
		
		char[] buffer = new char[32];
		int bufferPosition = 32;
		
		do {
			//如果(i & 0x01) i不等于0 ，得 1，否则选0
			//这里000 000 000 000 000 000 000 001 做“与运算”
			//    i 同时为1 ，得1；
			buffer[--bufferPosition] = ((i & 0x01) != 0 ) ? '1' : '0';
			//让i向右移一位
			i >>>=1;
			
		} while (i != 0);
		
		for (int j = bufferPosition; j < 32; j++)
			
			printnb(buffer[j]);
		
		print();
		 	
	}

}/*Output
i1 = 10101010101010101010101010101010
i2 = 1010101010101010101010101010101
~i1 = 1010101010101010101010101010101
~i2 = 10101010101010101010101010101010
i1 & i1= 10101010101010101010101010101010
i1 | i1= 1010101010101

i1 & i2 0
i1 | i2 11111111111111111111111111111111
i1 ^ i2 11111111111111111111111111111111

*///:~