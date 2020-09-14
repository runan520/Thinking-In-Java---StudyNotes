//: E04NewShapeType.java

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
public class E04NewShapeType {
	public static void main(String args[]) {
		Shape[] shapes = {
				new Circle(), new Square(), new Triangle(),new Tetrahedron()
		};
		for(Shape shape : shapes) {
			shape.draw();
			shape.erase();
			shape.msg();
			
		}
	}

}
