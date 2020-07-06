//: CommaOperator.java

package com.wuroc.chapterfour;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月5日
 *
 * 
 */
public class CommaOperator {
	
	public static void main(String[] args) {
		
		for(int i = 1, j = i + 10;i < 5; i++, j = i * 2)
			
			System.out.println("i = " + i + " j = " + j);
		
	}

}/*Output:
i = 1 j = 11
i = 2 j = 4
i = 3 j = 6
i = 4 j = 8
*///:~