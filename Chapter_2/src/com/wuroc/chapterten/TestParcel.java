//Parcel4.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
class Parcel4 {
	
	private class PContents implements Contents{
		private int i = 11;
		
		@Override
		public int value() {			
			return i;
		}		
	}

	protected final class PDestination implements Destination {
		private String label;
		private PDestination(String whereTo) {
			label = whereTo;			
		}
		
		@Override
		public String readLabel() {
			return label;
		}
	}
	
	public Destination destination(String s) {
		return new PDestination(s);
	}
	
	public Contents contents() {
		return new PContents();
	}
	
}
public class TestParcel{
			public static void main(String[] args) {
				Parcel4 p = new Parcel4();
				Contents c = p.contents(); 
				Destination d = p.destination("Tasmania");
				//The type Parcel4.PContents is not visible
				//Illegal -- can't access private class:
				//Parcel4.PDestination pc = p.new PContents();
			}
		}
	
	
	
	









