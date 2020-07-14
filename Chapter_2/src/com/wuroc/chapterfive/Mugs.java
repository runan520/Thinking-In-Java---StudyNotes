//: Mugs.java

package com.wuroc.chapterfive;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 * 
 * 
 */

class Mug{
	Mug(int marker){
		System.out.println("Mug(" + marker + ")");
	}
}


public class Mugs {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		print("mug1 & mug2 ininialized");
	}
	
	Mugs(){
		print("Mugs()");
	}
	Mugs(int i){
		print("Mugs(int)");
	}
	
	public static void main(String[] args) {
		print("Inside main()");
		new Mugs();
		print("new Mugs() completed");
		new Mugs(1);
		print("new Mugs(1) completed");
		
	}
}
/*Output:
Inside main()
Mug(1)
Mug(2)
mug1 & mug2 ininialized
Mugs()
new Mugs() completed
Mug(1)
Mug(2)
mug1 & mug2 ininialized
Mugs(int)
new Mugs(1) completed
 *///:WuRoc








