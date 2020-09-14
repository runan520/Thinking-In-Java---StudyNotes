//: Beetle.java

package com.wuroc.chapterseven;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * 
 * 
 */
class Insect{
	private int i = 9;
	protected int j;
	Insect(){
		print("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	/**
	 * @param string
	 * @return
	 */
	 static int printInit(String s) {
		 print(s);
		 return 555;
	}
}

public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	public Beetle() {
	print("k = " + k);
	print("j = " + j);
	}
	//static 优先
	private static int x2 = printInit("static Beetle.x2 initialized");
	//第一件事是事先访问Beetle.main()
	public static void main(String[] args) {
		print("Beetle constructor");
		Beetle b = new Beetle();
	}
}
/*Output:
static Insect.x1 initialized
static Beetle.x2 initialized
Beetle constructor
i = 9, j = 0
Beetle.k initialized
k = 555
j = 39
*///
