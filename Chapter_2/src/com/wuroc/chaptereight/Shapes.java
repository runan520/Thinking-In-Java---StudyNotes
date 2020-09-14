//: Shapes.java

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
public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String args[]) {
		Shape[] s = new Shape[9];
		for(int i = 0; i < s.length; i++) {
			s[i] = gen.next();
		}
		for(Shape shp : s)
			shp.draw();
				
	}

}
