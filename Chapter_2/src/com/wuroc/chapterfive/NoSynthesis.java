//: NoSynthesis.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月9日
 *
 * 
 */
class Bird2 {
	Bird2(int i) {}
	Bird2 (double d){}
}
public class NoSynthesis {
	//如果写了构造器，就代表可以省略默认构造器
//!	Bird2 b2 = new Bird2();
	Bird2 b3 = new Bird2(1);
	Bird2 b4 = new Bird2(1.0);
	
	

}





