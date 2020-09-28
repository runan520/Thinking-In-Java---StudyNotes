//Parcel7b.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
public class Parcel7b {
	class MyContents implements Contents {
		private int i = 11;
		
		@Override
		public int value() {
			return i;
		}
	}
	
	public Contents contents() {
		return new MyContents();
	}
	
	public static void main(String[] args) {
		Parcel7b p = new Parcel7b();
		Contents c = p.contents();
		System.out.println(c.value());
	}

}
