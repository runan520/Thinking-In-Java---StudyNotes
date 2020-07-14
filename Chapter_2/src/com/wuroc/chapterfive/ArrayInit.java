//: ArrayInit.java

package com.wuroc.chapterfive;

import java.util.Arrays;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class ArrayInit {
	public static void main(String[] args) {
		Integer[] a = {
				new Integer(1),
				new Integer(2),
				3,
		};
		Integer[] b = new Integer[] {
				new Integer(1),
				new Integer(2),
				3,
				
		};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}

}
/*Output:
[1, 2, 3]
[1, 2, 3]
 *///



