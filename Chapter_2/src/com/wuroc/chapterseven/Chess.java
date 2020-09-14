//: Chess.java

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
class Game{
	//3
	Game(int i){
		print("Game constructor");
	}
}
class BoardGame extends Game{

	/**
	 * @param i
	 */
	BoardGame(int i) {
//		if don`t 
//		Unresolved compilation problem: 
//		Implicit super constructor Game() is undefined.
//		Must explicitly invoke another constructor.
//		2
		super(i);
		
		print("BoardGame constructor");
	}
	
}
public class Chess extends BoardGame {

	/**
	 * @param i
	 */
	Chess() {
		//1 调用BoardGame的构造器
		super(11);
		print("Chess constructor");
	}
	public static void main(String[] args) {
		Chess x = new Chess();
	} 
	

}
/*Output:
Game constructor
BoardGame constructor
Chess constructor
*///
