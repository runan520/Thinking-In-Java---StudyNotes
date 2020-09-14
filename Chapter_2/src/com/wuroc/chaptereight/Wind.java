//: Wind.java

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
public class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
	
	String what() {
		return "Wind";
	}
	void adjust() {
		print("Adjusting Wind");
	}

}
