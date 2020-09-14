//: CADSystem.java

package com.wuroc.chapterseven;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月20日
 * 
 * 
 */
class Shape {
	Shape(int i) {
		print("Shape constructor");
		}
		void dispose() {
			print("Shap dispose");
		}
	}
class Circle extends Shape{
	Circle(int i){
		super(i);
		print("Deawing Circle");
	}
	void dispose() {
		print("Erasing Circle");
	}
}
class Triangle extends Shape{
	Triangle(int i){
		super(i);
		print("Drawing Circle");
	}
	void dispose() {
		print("Erasing Triangle");
		super.dispose();
	}
}
class Line extends Shape{
	private int start, end;

	/**
	 * @param i
	 */
	
	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		print("Drawing Line: " + start + ", " + end);
		
	}
	void dispose() {
		print("Erasing Line: " + start + ", " + end);
		super.dispose();
	}
	
}

public class CADSystem extends Shape {
	private Circle c;
	private Triangle t;
	//这里只是一个对象的初始化
	private Line lines[] = new Line[3];
	
	/**
	 * @param i
	 */
	public CADSystem(int i) {
		super(i + 1);
		for(int j = 0; j < lines.length; j++) 
			lines[j] = new Line(j, j*j);
		c = new Circle(1);
		t = new Triangle(1);
		print("Combined constructor");
	}
	public void dispose() {
		print("CADSystem.dispose()");
		//清理的顺序与创建时相反
		t.dispose();
		c.dispose();
		for(int i = lines.length - 1; i >= 0; i--)
			lines[i].dispose();
		super.dispose();
	}
	
	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try {
			
		}finally {
			x.dispose();
		}
	}
	

}
