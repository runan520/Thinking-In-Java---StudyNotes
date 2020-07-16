//: E04ForeignClass.java

package com.wuroc.chaptersix2;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月15日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class E04ForeignClass {
	public static void main(String[] args) {
		//错误的原因是protect可以提供一个包的访问权限
//!		com.wuroc.chaptersix.E04PackagedClass.greeting();
	}

}
/*
 * Solution: Eo 4_PackagedClass is in its own package, and greeting() is not a
 * public method so is generally unavailable outside of the package access.
 * local. If Eo4_ForeignClass were included in access. local, it would share the
 * same package as Eo4_PackagedClass. greeting(), and so could access it.(See
 * Exercises 6&9.)
 */
