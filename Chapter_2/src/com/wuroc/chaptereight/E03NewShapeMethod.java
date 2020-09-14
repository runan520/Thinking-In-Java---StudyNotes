//: E03NewShapeMethod.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月23日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class E03NewShapeMethod {
	public static void main(String[] args) {
		Shape[] shapes = {
				new Circle(), new Square(), new Triangle(),
				
		};
		
	for(Shape shape : shapes) {
		shape.draw();
		shape.erase();
		//在任何覆盖的地方，我们都会使用该版本，
		//例如Circle；否则，我们使用默认的基类版本。
		shape.msg();
	}
	}
}


