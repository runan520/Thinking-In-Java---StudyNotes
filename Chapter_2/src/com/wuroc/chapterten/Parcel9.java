//Parcel9.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
public class Parcel9 {
	//必须是final
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;
			@Override
			public String readLabel() {
				return label;
			}		
		};
	}
	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania1");
		System.out.println(d.readLabel());
	}

}
