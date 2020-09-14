//: Wind.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Instrument{
	public void play() {}
	static void tune(Instrument i) {
		i.play();
	}
}
public class Wind extends Instrument {
	public static void main(String args[]) { 
		Wind flute = new Wind();
		Instrument.tune(flute);
		
	}

}






