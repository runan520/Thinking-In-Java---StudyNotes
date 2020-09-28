//Parcel7.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
public class Parcel7 {
	public Contents contents() {
		return new Contents() {
			private int i = 11;
			
			@Override
			public int value() {
				return i;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		System.out.println(c.value());
	}

}

//Output:
//11
