//Parcel11.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
public class Parcel11 {
	//将内部类声明为static，叫做嵌套类
	//普通的内部类对象是不可以有static数据，static字段
	private static class ParcelContents implements Contents {
		private int i = 11;
		@Override
		public int value() {
			return i;
		}
	
	}
	protected static final class ParcelDestination implements Destination {
		private String label;
		private ParcelDestination(String whereTo) {
			label = whereTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
		
		//嵌套类可以包含其他静态元素
		public static void f() {
			
		}
		static int x = 10;
		static class AnotherLevel {
			public static void f() {}
				static int x = 10;
			}
		}
	
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	public static Contents contents() {
		return new ParcelContents();
	}
	public static void main(String[] args) {
		Contents c = contents();
		Destination d = destination("Tasmania");
	}
	}


