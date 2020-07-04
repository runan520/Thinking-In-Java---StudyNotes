//: Overflow.java

package com.wuroc.chapterthree;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月5日
 *
 * 
 */
public class Overflow {
	public static void main(String[] args) {
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big );
		//结果会溢出;
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);
		
	}

}
/*
 * Output: 
 * big = 2147483647 
 * bigger = -4
 *///:~
