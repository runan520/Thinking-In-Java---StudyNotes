//: InitialValues.java

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
public class InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;
	void printInitialValues() {
		print("Data type        Initial value");
		print("boolean         " + t);
		print("char            [" + c + "]" );
		print("byte            " + b);
		print("short           " + s);
		print("int             " + i);
		print("long            " + l);
		print("float           " + f);
		print("double          " + d);
		print("reference       " + reference );
	}
	
	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
		
	}

}
/*Output:
Data type Initial value 
boolean    false 
char       []
byte       0
int        0
1ong       0
float      0.0
double     0.0
reference null
*///


