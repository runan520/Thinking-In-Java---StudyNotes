//: ForEachInt.java

package com.wuroc.chapterfour;
import static com.wuroc.util.Print.*;
import static com.wuroc.util.Range.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月6日
 *
 * 
 */
public class ForEachInt {
	public static void main(String[] args) {
		
		for(int i : range(10))  //0..9
			
			printnb(i + " ");
		
		print();
		
		for(int i : range(5, 10))  //5..9
			
			printnb(i + " ");
		
		print();
		
		for(int i : range(5, 20, 3)) //5..20 step 3
			
			printnb(i + " ");
		
		print();
		
			
	}

}/*Output:
0 1 2 3 4 5 6 7 8 9 
5 6 7 8 9 
5 8 11 14 17 
*///:~


