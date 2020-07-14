//: ScoreTester.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月10日
 *
 * 
 */
enum Score{
	EXCELLENT,
	QUALIFIED,
	FAILED;
	
};
public class ScoreTester {
	public static void main(String[] args) {
		giveScore(Score.EXCELLENT);
	}

	/**
	 * @param excellent
	 */
	public static void giveScore(Score s) {
		switch(s) {
		case EXCELLENT:
			System.out.println("Excellent");
			break;
		case QUALIFIED:
			System.out.println("Qualified");
			break;
		case FAILED:
			System.out.println("Failed");
			break;
		}
		
	}
	

}







