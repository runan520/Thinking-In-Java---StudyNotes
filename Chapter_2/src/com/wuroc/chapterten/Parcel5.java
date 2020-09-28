//Parce5.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
public class Parcel5 {
	public Destination destination(String s) {
		final class PDestination implements Destination {
			private String label;
			
			private PDestination(String whereTo) {
				label = whereTo;
			}

			@Override
			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}
	
	public static void main(String args[]) {
		Parcel5 p = new Parcel5();
		//PDestination  不可以用，由于Destination是基类，并且13行是返回类型已规定好
		Destination d = p.destination("Tasmania");
		System.out.println(d.readLabel());
	}

}
