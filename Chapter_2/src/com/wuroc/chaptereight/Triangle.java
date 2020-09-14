//: Triangle.java

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
public class Triangle extends Shape {
	@Override
	public void draw() {
		print("Triangle.draw()");
		
	}
	@Override
	public void erase() {
		print("Triangle.erase()");
	}
	//当没有进行重写时，向上转型就会变成访问默认的基类的方法
	
	@Override
	public void msg() {
		print("Triangle.msg()");
	}

}
