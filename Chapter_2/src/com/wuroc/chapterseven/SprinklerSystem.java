//: SprinklerSystem.java

package com.wuroc.chapterseven;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月16日
 * 
 * 
 */
class WaterSource {
	private String s;
	WaterSource(){
		print("Watersource()");
		s = "Constructed";
	}
	//tostring（）上使用@Override 注释来告诉编译器，以确保正确地覆盖。
//	@Override是可选的，但它有助于验证你没有拼写错误
//	（或者更微妙地说，大小写字母输入错误）
	@Override
	public String toString() {
		return s;
		
	}
	
}
public class SprinklerSystem {
	private String valve1, valve2, valve3, valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	@Override
	public String toString() {
		return
				"valve1 = " + valve1 + " " +
				"valve2 = " + valve2 + " " +
				"valve3 = " + valve3 + " " +
				"valve4 = " + valve4 + "\n" +
				"i = " + i + " " + "f = " + f + " " +
				"source = " + source;
	}
	
	public static void main(String[] args) {
		SprinklerSystem sprinklers = new SprinklerSystem();
		System.out.println(sprinklers);
	}

}
