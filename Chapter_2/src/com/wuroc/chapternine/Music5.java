//Music5.java
package com.wuroc.chapternine;

import com.wuroc.chaptereight.Note;

/**
 * @author RocWu
 *
 */
interface Instrument1 {
	//编译时常数
	int VALUE = 5;   //static & final
	
	default void play(Note n) {
		System.out.println(this + ".play()" + n);
	}
	
	default void adjust() {
		System.out.println("Adjusting " + this);
	}
}

class Wind1 implements Instrument1 {
	@Override
	public String toString() {
		return "Wind";
	}
}

class Percussion1 implements Instrument1 {
	@Override
	public String toString() {
		return "Percussion";
	}
	
}

class Stringed1 implements Instrument1 {
	@Override
	public String toString() {
		return "Stringed";
	}
}
class Brass1 extends Wind1 {
	@Override
	public String toString() {
		return "Brass";
		
	}
}

class Woodwind1 extends Wind1 {
	@Override
	public String toString() {
		return "Woodwind";
	}
}
public class Music5 {
	static void tune(Instrument1 i) {
		i.play(Note.MiDDLE_C);
	}
	
	static void tuneAll(Instrument1[] e) {
		for(Instrument1 i: e) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		Instrument1[] orchestra = {
				new Wind1(),
				new Percussion1(),
				new Stringed1(),
				new Brass1(),
				new Woodwind1()
				
		};
		
		tuneAll(orchestra);
	}

}




