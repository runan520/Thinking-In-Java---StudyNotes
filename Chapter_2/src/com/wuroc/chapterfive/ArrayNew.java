//: ArrayNew.java

package com.wuroc.chapterfive;
import static com.wuroc.util.Print.*;

import java.util.Arrays;
import java.util.Random;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 * 
 * 
 */
public class ArrayNew {
	public static void main(String[] args) {
		
		int[] a;
		Random rand = new Random(47);
		//int[] a = new int[rand.nextInt(20)]
		a = new int[rand.nextInt(20)];
		
		print("length of a = " + a.length);
		print(Arrays.toString(a));
	}

}








