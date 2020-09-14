//: Stringed.java

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
class Stringed extends Instrument{
	public void play(Note n) {
		print("Stringed.play() " + n);
	}
	public String what() {
		return "Stringed";
	}
	public void adjust() {
		print("Adjusting Stringed");
	}

}
class Brass extends Instrument {
	public void play(Note n) {
		print("Brass.play() " + n);
	}
	public void adjust() {
		print("Adjusting Brass");
	}
}
public class Music2 {
	//等价下面的方法
	public static void tune(Wind i) {
		i.play(Note.MiDDLE_C);
	}
	public static void tune(Stringed i) {
		i.play(Note.MiDDLE_C);
	}
	public static void tune(Brass i) {
		i.play(Note.MiDDLE_C);
	}
//	public static void tune(Instrument i) {
//		i.play(Note.MiDDLE_C);
//	}
	public static void main(String[] args) {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}
}
/*Output:
Wind.play() MiDDLE_C
Stringed.play() MiDDLE_C
Brass.play() MiDDLE_C
*///