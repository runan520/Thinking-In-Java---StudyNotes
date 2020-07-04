//: AutoInc.java

package com.wuroc.chapterthree;

import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月1日
 *
 * 
 */
public class AutoInc {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		print("i : " + i);
		//先执行运算，再生成值
		print("++i : "+ ++i);
		//先生成值，再执行运算，打印出来还是2.
		print("i++ :" + i++);
		//
		print("i : " + i);
		
		print("--i : " + --i);
		
		print("i-- : " + i--);
		
		print("i : " + i);
		
		
		
	}
	

}/* Output:
i : 1
++i : 2
i++ :2
i : 3
--i : 2
i-- : 2
i : 1

*///:~
