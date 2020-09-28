//Parcel1.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
public class Parcel1 {
	class Contents {
		private int i = 11;
		
		public int value() {
			return i;
		}
		
	}
	
	class Destination {
		private String label;
		
		Destination(String whereTo){
			label = whereTo;
		}
		
		String readLable() {
			return label;
		}
	}
	
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLable());
	}
	public static void main(String[] args) {
		Parcel1 p =  new Parcel1();
		p.ship("Tasmania");
	}
	
	
}












