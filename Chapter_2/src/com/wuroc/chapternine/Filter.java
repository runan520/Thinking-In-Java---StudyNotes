//Filter.java
package com.wuroc.chapternine;

/**
 * @author RocWu
 *
 */
public class Filter {
	
	public String name() {
		return getClass().getSimpleName();
	}
	
	public Waveform process(Waveform input) {
		return input;
	}

}
