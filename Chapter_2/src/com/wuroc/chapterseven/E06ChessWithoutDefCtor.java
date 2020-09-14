//: E06ChessWithoutDefCtor.java

package com.wuroc.chapterseven;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月17日
 * 
 * 
 */
class ChessWithoutDefCtor extends BoardGame{

	
	ChessWithoutDefCtor() {
		super(11);
		print("ChessWithoutDefCtor  constructor");
	}
	
}
public class E06ChessWithoutDefCtor {
	
	public static void main(String args[]) {
		
		new ChessWithoutDefCtor();
	}

}
/*Output:
 * BoardGame没有ChessWithoutDefCtor的默认构造函数，
 * 也没有自己的默认构造函数（编译器可用于合成该构造函数），
 * 因此该程序将无法编译。 BoardGame定义了一个带参数的构造函数，
 * 因此编译器无法生成默认值。此外，如果取消注释ChessWithoutDefCtor的默认构造函数定义，
 * 则编译器将要求您首先在派生类构造函数中调用基类构造函数。
 * *///
