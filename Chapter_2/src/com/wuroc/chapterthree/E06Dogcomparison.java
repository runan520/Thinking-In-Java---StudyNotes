//: E06Dogcomparison.java

package com.wuroc.chapterthree;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月1日
 *
 * 
 */
public class E06Dogcomparison {
	//
	static void compare (Dog dog1, Dog dog2) {
		
		print("== on top references: " + (dog1 == dog2 ) );
		
//		boolean java.lang.Object.equals(Object obj)
		print("equals() on top references: " + dog1.equals(dog2) );
	
		print("== on names: " + dog1.name.equals( dog2.name) );
		
		print("equals() on names: " + dog1.name.equals(dog2.name) );
		
		print("== on says: " + (dog1.says == dog2.says) );
		
		print("equal() on says: " + dog1.says.equals(dog2.says) );
		
		
		
		
	}
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		Dog dog2 = new Dog();
		
		Dog dog3 = dog1;  //" 别名  "  reference
		
		dog1.name = "spot";
		
		dog1.says = "ruff";
		
		dog2.name = "spot";
		
		dog2.says = "wurff";
		
		print("Comparing dog1 and dog2 objects...");
		
		compare(dog1, dog2);
		
		print("\nComparing dog1 and dog3 object...");
		
		compare(dog1, dog3);
		
		print("\nComparing dog2 and dog3 object...");
		
		compare(dog2, dog3);
		
		
		
		
		
	}

}
