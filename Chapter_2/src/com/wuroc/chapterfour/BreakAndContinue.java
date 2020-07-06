//: BreakAndContinue.java

package com.wuroc.chapterfour;
import static com.wuroc.util.Range.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月6日
 *
 * 
 */
public class BreakAndContinue {
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
		if(i == 74) break;
		if(i % 9 != 0) continue;
		System.out.print(i + " ");
			
		}
		System.out.println();
		// 使用 foreach 循环
		for(int i : range(100)) {
			if(i == 74 ) break; //跳出循环
			if(i % 9 != 0) continue;
			System.out.print(i + " ");
			
			
		}
		System.out.println();
		int i = 0;
		// "无限循环"；
		while(true) {
			i++;
			int j = i*27;
			if(j == 1269) break;
			if(i % 10 != 0) continue;
			System.out.print(i + " ");
		}
	}

	
}/*Output:
0 9 18 27 36 45 54 63 72 
0 9 18 27 36 45 54 63 72 
10 20 30 40 
*///:~








