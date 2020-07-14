//: ArraysOfPrimitives.java

package com.wuroc.chapterfive;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 * 
 * 
 */
public class ArraysOfPrimitives {
	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5};
		int[] a2;
		//只是复制了一个引用
		a2 = a1;
		for (int i = 0; i < a2.length; i++) 
			a2[i] = a2[i] + 1;
		for(int i = 0; i < a1.length; i++) {
			print("a1[" + i + "] = " + a1[i]);
		}
		
	}

}
