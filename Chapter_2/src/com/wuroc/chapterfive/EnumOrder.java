//: EnumOrder.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月14日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class EnumOrder {
	public static void main(String[] args) {
		for (Spiciness s : Spiciness.values())
			System.out.println(s + ", ordinal " + s.ordinal());
	}

}
