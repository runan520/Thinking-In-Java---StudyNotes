//: mUSIC3.java

package com.wuroc.chaptereight;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月24日
 * 
 * 
 */


class Percussion extends Instrument{
	void play(Note n) {
		print("Percussion.play() " + n);
	}
	String what() {
		return "Percussion";
	}
	@Override
	void adjust() {
		print("Adjusting Pricussion");
	}
}

class Woodwind extends Wind {
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}
	String what() {
		return "Woodwing";
	}
}
public class  Music3 {
	public static void tune(Instrument i) {
		i.play(Note.MiDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {
				new Wind(), new Percussion(), new Stringed(), 
				new Brass(), new Woodwind(),
		};
		tuneAll(orchestra);
	}
	

}






