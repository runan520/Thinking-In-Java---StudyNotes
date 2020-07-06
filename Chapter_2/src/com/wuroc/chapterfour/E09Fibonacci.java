//: E09Fibonacci.java

package com.wuroc.chapterfour;

import java.util.Random;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月6日
 *
 * 
 */
public class E09Fibonacci {
	
	static int fib(int n) {
		
		if(n <= 2)
			
			return 1;
		
		return fib(n-1) + fib(n -2);
		
	}
	public static void main(String[] args) {
		
		Random rand = new Random(47);
		
		int r=rand.nextInt(8);
		
		System.out.println(r);
		
		if(r < 0) {
			
			System.out.println("Cannot ues negative numbers");
		
		return;
		
				}
		
		for(int i = 1; i <= r; i++)
			
			System.out.print(fib(i) + ", ");
	}

}/*Output
5
1, 1, 2, 3, 5, 
*///:~WuRoc





















