//: ArrayClassObj.java

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
public class ArrayClassObj {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		print("length of a = " + a.length);
		for(int i = 0; i < a.length; i++)
			a[i] = rand.nextInt(500);
		print(Arrays.toString(a));
	}

}









