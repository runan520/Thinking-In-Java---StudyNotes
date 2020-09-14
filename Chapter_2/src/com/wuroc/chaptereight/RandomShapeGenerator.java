//: RandomShapeGenerator.java

package com.wuroc.chaptereight;
import static com.wuroc.util.Print.*;

import java.util.Random;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月23日
 * 
 * 
 */
public class RandomShapeGenerator {
	private Random rand= new Random(47);
	public Shape next() {
		switch(rand.nextInt(3)) {
		default:
		case 0: return new Circle();
		case 1: return new Square();
		case 2: return new Triangle();
		}
		
	}

}
