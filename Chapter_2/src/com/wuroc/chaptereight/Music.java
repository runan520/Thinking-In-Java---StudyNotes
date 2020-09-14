//: Music.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月23日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class Music {
	public static void tune(Instrument i) {
		i.play(Note.MiDDLE_C);
	}
	public static void main(String args[]) {
		Wind flute = new Wind();
		tune(flute);
	}

}
