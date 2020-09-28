//Waveform.java
package com.wuroc.chapternine;

/**
 * @author RocWu
 *
 */

public class Waveform {

	private static long counter;
	private final long id = counter++;
	
	@Override
	public String toString() {
		return "Waveform " + id;
		
	}
}







