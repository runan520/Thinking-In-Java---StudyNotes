//: E07To98.java

package com.wuroc.chapterfour;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月6日
 *
 * 
 */
public class E07To98 {
	public static void main(String[] args) {
		for(int i =1; i <= 100; i++) {
			if(i == 99)
				//break;
				//与return 等价
				return;
			System.out.println(i + " ");
			
		}
	}
	

}
