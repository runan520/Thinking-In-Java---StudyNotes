//: URShift.java

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
public class URShift {
	
	public static void main(String[] args) {
		
		int i = -1;
		
		print(Integer.toBinaryString(i) );
		
		//无符号 右移操作符 （>>>）,他使用零扩展；无论正负，都在高位插入0；
		
		i >>>=10;
		
		print(Integer.toBinaryString(i) );
		
		long l = -1;
		
		print(Long.toBinaryString(l));
		
		l >>>=10;
		
		print(Long.toBinaryString(l));
		
		short s = -1;
		
		print(Integer.toBinaryString(s));
		
		s>>>=10;
		
		print(Integer.toBinaryString(s));
		
		byte b = -1;
		
		print(Integer.toBinaryString(b));
		
		b >>>= 10;
		
		print(Integer.toBinaryString(b));
		
		b = -1;
		
		print(Integer.toBinaryString(b));
		print(Integer.toBinaryString(b>>>10) );

	}

}/*Output:
11111111111111111111111111111111
1111111111111111111111
1111111111111111111111111111111111111111111111111111111111111111
111111111111111111111111111111111111111111111111111111
11111111111111111111111111111111
11111111111111111111111111111111
11111111111111111111111111111111
11111111111111111111111111111111
11111111111111111111111111111111
1111111111111111111111
*/// : ~
