//: ShortCircuit.java

package com.wuroc.chapterthree;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月2日
 *
 * 
 */
public class ShortCircuit {
	
	static boolean test1(int val) {
		
		print("test1(" + val + ")");
	
		print("result: " + (val < 1));
		
		return val<1;
		
	}
	
	static boolean test2(int val) {
		
		print("test2(" + val + ")");
		
		print("result: " + (val<2));
		
		return val<2;
		
	}
		static boolean test3(int val) {
			
			print("test3(" + val +")");
			
			print("result: " + (val < 3) );
			
			return val < 3;
			
			
		}
		
		public static void main(String[] args ) {
		/*
		 * 第一个测试时true ， 第二个测试为false， 
		 * 由于意味着肯定false ， 所以没必要继续计算剩余的表达式三
		 */
			boolean b = test1(0) && test2(2) && test3(2);
			
			print("expression is " + b);
			
		}
	}/* Output
test1(0)
result: true
test2(2)
result: false
expression is false
*///
	
	
	
	
	
	
	


