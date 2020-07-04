//: RoundingNumbers.java

package com.wuroc.chapterthree;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月4日
 *
 * 
 */
public class RoundingNumbers {

	public static void main(String[] args) {
//		round(double a) 
//      返回最接近参数的 long。
		double above = 0.7, below = 0.4;
		
//		round(float a) 
//      返回最接近参数的 int。加0.5
		float fabove = 0.7f, fbelow = 0.4f;
		
		/*
		 * 由于round() 是 java.lang 的一部分，
		 * 因此在使用它时不需要额外地导入。
		 */		
		print("Math.round(above): " +Math.round(above));
		
		print("Math.round(below): " +Math.round(below));
		
		print("Math.round(fabove): " +Math.round(fabove));

		print("Math.round(fbelow): " +Math.round(fbelow));
		
	}
}
