//: IfElse.java

package com.wuroc.chapterfour;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月5日
 *
 * 
 */
public class IfElse {
	
	static int result = 0;
	
	static void test(int testval, int target) {
		if ( testval > target) 
			result = +1;
		//"else if "并非关键字，而仅仅只是一个else后紧跟另一个新的if语句。
			else if (testval < target) 
				result = -1;
			else
				result = 0; //对比
	}
	
	public static void main(String[] args) {
		
		test(10, 5);
		print(result);
		test(5, 10);
		print(result);
		test(5, 5);
		print(result);
		
		
	}
			
}
/*Output:
 * 1 -1 0
 *///:WuRoc
