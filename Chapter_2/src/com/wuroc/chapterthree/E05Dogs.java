//: E05Dogs.java

package com.wuroc.chapterthree;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月1日
 *
 * 
 */
class Dog{
	String name;
	
	String says;
	
}
public class E05Dogs {
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		
		Dog dog2 = new Dog();
		
		dog1.name = "Tom";
		dog1.says = "ruff!";
		dog2.name = "Jerry";
		dog2.says = "wurf!";
		
		System.out.println(dog1.name + " says " + dog1.says);
		System.out.println(dog2.name + " says " + dog2.says);
		
		
		
	}
	
	

}/* Output:
Tom says ruff!
Jerry says wurf!
*/// : ~
/****************** Exercise 5 *****************
*	Create a class called Dog with two Strings:
*	name and says. In main(), create two dogs,
*	"spot" who says, "Ruff!", and "scruffy" who
*	says, "Wurf!". Then display their names and
*	what they say.
***********************************************/ 