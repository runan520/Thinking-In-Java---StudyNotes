//: Circle.java

package com.wuroc.chaptereight;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月23日
 * 
 * 
 */
public class Circle extends Shape {
	@Override
	public void draw() {
		print("Circle.draw()");
	}
	@Override
	public void erase() {
		print("Circle.erase()");
	}
	@Override
	public void msg() {
		print("Circle.msg()");
	}
	

}
