//: WhileTest.java

package com.wuroc.chapterfour;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月5日
 *
 * 
 */
public class WhileTest {
	//此方法返回true，与false
	
	static boolean condition() {
		
		boolean result = Math.random() < 0.99;
		
		return result;
		
	}
	public static void main(String[] args) {
		
		while (condition()) 
			System.out.println("Inside 'while'");
			
		System.out.println("Exited 'while'");
		
	}

}
/* Output:
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Inside 'while'
 * Inside 'while' Inside 'while' Inside 'while' Inside 'while' Exited 'while'
 *///:~
