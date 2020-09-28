//Parcel10.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
public class Parcel10 {
	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			//Instance initialization for each object:
			{
				//四舍五入
				cost = Math.round(price);
				//if语句不能作为字段初始化动作的一部分来执行。
				if(cost > 100)
					System.out.println("Over budget!");
				else
					System.out.println("No over budget!");
			}
			
			private String label = dest;
			@Override
			public String readLabel() {
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		
		Destination d = p.destination("Tasmania", 100.195F);
	}

}
