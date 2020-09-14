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
class Instrument{
	/**
	 * 
	 */
	void play(Note n) {
		print("Instrument.play() " + n);
	}
	String what() {
		return "Instrument";
	}
	void adjust() {
		print("Adjusting Instrument");
	}
	
}

