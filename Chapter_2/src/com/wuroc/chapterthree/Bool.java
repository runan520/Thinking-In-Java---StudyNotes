//: Bool.java

package com.wuroc.chapterthree;
import static com.wuroc.util.Print.*;

import java.util.Random;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月1日
 *
 * 
 */
public class Bool {
	
	public static void main(String[] args) {
		
		Random rand = new Random(47);
		
		int i = rand.nextInt(100);
		
		int j = rand.nextInt(100);
		
		print("i = " + i);
		
		print("j = " + j);
		
		print("i > j is " + (i>j));
		
		print("i < j is " + (i<j));
		
		print("i >= j is "+ (i >= j));
		
		print("i <= j is " + (i <= j));
		
		print("i == j is " + (i == j));
		
		print("i != j is " + (i != j));
	// "//!"这种注释语法使得注释能够被自动被移除，以方便测试	
//		与 或 非 操作只可应用于布尔值
//!		print("i && j is " + (i && j));
		
//!		print("i || j is " + (i || j));
		
//!		print("!i is " +　!i);
	
		print("(i <10) && (j< 10 ) is " + ((i < 10) && (j<10)) );
		
		print("(i<10) || (j<10) is " + ((i <10 ) || (j < 10)) );
		
		
	}

}
