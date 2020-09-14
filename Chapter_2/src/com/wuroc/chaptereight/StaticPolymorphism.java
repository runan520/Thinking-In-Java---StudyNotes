//: StaticPolymorphism.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年8月20日
 * import static com.wuroc.util.Print.*;
 * 
 */
class StaticSuper{
	//静态方法只与类关联，与单个的对象无关
	public static String staticGet() {
		return "Base staticGet()";
	}
	
	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}
	public String dynamicGet() {
		return  "Derived dynamicGet()";
	}
	
}
public class StaticPolymorphism {
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub();
		System.out.println(StaticSuper.staticGet());
		System.out.println(sup.dynamicGet());
	}
	

}








