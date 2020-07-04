//: E07CoinFlipping.java

package com.wuroc.chapterthree;

import java.util.Random;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月2日
 *
 * 
 */
public class E07CoinFlipping {

	public static void main(String[] args) {
		
		Random rand = new Random(47);
		
		boolean flip = rand.nextBoolean();
		
		System.out.println(flip);
		
		System.out.println("OUTCOME: ");
		//如果为真则返回HEAN
		System.out.println(flip ? "HEAD" : "TALL");
		
		
		
		
		
		
		
	}
}/* Output

true
OUTCOME: 
HEAD
*/// : ~
