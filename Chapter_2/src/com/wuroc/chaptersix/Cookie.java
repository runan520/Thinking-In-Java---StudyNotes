//: Cookie.java

package com.wuroc.chaptersix;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月15日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class Cookie {
//	构造器是public
	public Cookie() {
		System.out.println("Cookie constructor");
	}
	//bite()只向在package com.wuroc.chaptersix
	//包中的类提供访问权
//	void bite() {
//		System.out.println("bite");
	//如果加上protect关键字，就会被继承的基类所实现。
	protected void bite() {
		System.out.println("bite");
		

	}

}
