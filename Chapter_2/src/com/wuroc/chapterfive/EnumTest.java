//: EnumTest.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月11日
 *
 * 
 */
public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
		
		this.day = day;
	}
	public void tellItLikeItIs() {
		//day这是实参
		switch(day) {
		case MONDAY:
			System.out.println("Mondays are bad");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends ara best.");
			break;
			default:
				System.out.println("Midweek days are so-so");
				break;
		}
	}
	public static void main(String[] args) {
		//直接调用构造函数，传入实参Day.MONDAY
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		//当传入实参后，day就有值，再调用tellItLikeItIs()方法
		firstDay.tellItLikeItIs();
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}
}
