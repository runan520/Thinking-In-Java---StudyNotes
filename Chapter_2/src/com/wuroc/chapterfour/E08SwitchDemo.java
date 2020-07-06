//: E08SwitchDemo.java

package com.wuroc.chapterfour;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月6日
 *
 * 
 */
public class E08SwitchDemo {
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) 
			switch(i) {
			case 1: print("case 1");
					
			case 2: print("case 2");
					
			case 3: print("case 3");
					break;
			case 4: print("case 4");
					break;
			case 5: print("case 5");
					break;
			default: print("default");
			}
	}

}







