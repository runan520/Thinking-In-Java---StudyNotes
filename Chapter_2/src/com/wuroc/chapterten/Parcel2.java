//Parcel1.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
public class Parcel2 {
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
			
			System.out.println(label);
		}
		
		String readLable() {
			return label;
		}
	}
	
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents contents() {
		return new Contents();
	}
	
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLable());
	}
	public static void main(String[] args) {
		Parcel2 p =  new Parcel2();
		p.ship("Tasmania");
		
		Parcel2 q = new Parcel2();
		//Defining references to inner classer
		//OuterClassName.InnerClassName
		//如果想从外部类的非静态方法之外的任意位置创建某个内部类的对象
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.to("Borneo");
		
	}
	
	
}












