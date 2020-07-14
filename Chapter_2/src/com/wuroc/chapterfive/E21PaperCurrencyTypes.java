//: PaperCurrencyTypes.java

package com.wuroc.chapterfive;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月14日
 * 
 */
enum PaperCurrencyTypes{
	ONE, TWO, THREE, FIVE, EIGHT, FIFTY
}
public class E21PaperCurrencyTypes {
	public static void main(String args[]) {
		//values()方法，用来按照enum常量的声明顺序，
		//产生由这些常量值构成的数组
		for(PaperCurrencyTypes s : PaperCurrencyTypes.values())
		//创建enum时，他会创建ordinal（）方法，
			//用来表示某个特定enum常量的声明顺序
		System.out.println(s + ", ordinal " + s.ordinal());
	}
	

}
/*Output:
ONE, ordinal 0
TWO, ordinal 1
THREE, ordinal 2
FIVE, ordinal 3
EIGHT, ordinal 4
FIFTY, ordinal 5
*///
