//: IceCream.java

package com.wuroc.chaptersix;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月15日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Sundae {
	private Sundae() {}
	//Sundae类，例如int类
		static Sundae makeASundae() {
			//创建对象
			return new Sundae();
		}
		
	}
public class IceCream{
	public static void main(String[] args) {
		//Because the constructor Sundae() is not visible
//!		Sundae x = new Sundae();
		Sundae x = Sundae.makeASundae();
		
	}
}

