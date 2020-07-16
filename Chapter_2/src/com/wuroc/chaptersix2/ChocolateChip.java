package com.wuroc.chaptersix2;
//: ChocolateChip.java



import com.wuroc.chaptersix.Cookie;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月15日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class ChocolateChip extends Cookie{
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}
	public void chomp() {
//!		bite();
		//如果加上protect。尽管bite具有包访问权限，它仍然不是public
		bite();
	}
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
	}

}
