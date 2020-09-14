//: Drawing.java

package com.wuroc.chapterseven;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月17日
 * 
 * 
 */
class Art{
	Art(){
		print("Art constructor");
	}
}

class Drawing extends Art {
	Drawing(){
		print("Drawing constructor");
	}
}

public class Cartoon extends Drawing{
	//即使没有构造器，编译器也会为你合成一个默认的构造器
//		public Cartoon() {
//			print("Cartoon constructor");
//			}
	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}

}
/*output:
Art constructor
Drawing constructor
*///