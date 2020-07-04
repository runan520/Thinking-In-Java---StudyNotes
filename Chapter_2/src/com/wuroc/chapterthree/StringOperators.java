//: StringOperators.java

package com.wuroc.chapterthree;

import static com.wuroc.util.Print.*;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月4日
 *
 * 
 */
public class StringOperators {
	public static void main(String[] args) {
		int x = 0, y= 1, z= 2;
		
		String s= "x, y, z ";
		
//		表达式以一个字符串起头，
//		那么后续所有的操作数都必须是字符型
//		s就是字符串，后面相加也是字符串
		print(s + x + y + z);
		
		print(x + " " + s); //转换成String类型
		//"x, y, z "+ "(summed) = "
		s += "(summed) = "; //连锁作用标记（指+号）
		
		print(s + (x + y + z));
		
		print("" +x); //Shorthand for Integer.toString()
		
	}
	
	
	

}
