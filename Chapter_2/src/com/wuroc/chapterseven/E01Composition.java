//: E01Composition.java

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
class Simple{
	String s;
	//构造器
	public Simple(String si) {
		s = si;
	}
	//非基本类的方法都有一个toStirng()方法，@Override注释是覆盖的意思
	@Override
	public String toString() {
		return s;
	}
	//调用方法是setString() 
	public void setString(String sNew) {
		s = sNew;
	}
	
}
class Second{
	Simple simple;
	String s;
	public Second(String si) {
		s = si;               //'Simple' not initialized
	}
	
	public void check() {
		if(simple == null)
			print("not initialized");
		else
			print("initialized");
		
	}
	
	private Simple lazy() {
		if(simple == null) {
			print("Creating Simple");
			simple = new Simple(s);
			
		}
		return simple;
	}


	public Simple getSimple() {
		
		return lazy();
}
	@Override
	public String toString() {
		return lazy().toString();
	}
	
	
	public void setSimple(String sNew) {
		lazy().setString(sNew);
	}
	
	
}
public class E01Composition {
	public static void main(String args[]) {
		Second second = new Second("Init String");
		second.check();
		print(second.getSimple());
		second.check();
		print(second);
		second.setSimple("New String");
		print(second);
	}

}
