//: E12RodentInitialization.java

package com.wuroc.chaptereight;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年9月11日
 * 
 * 
 */
class Member{
	public Member(String id) {
		print("Member constructor " + id);
	}
}
class Rodent2 {
	Member m1 = new Member("r1"), m2 = new Member("r2");
	public Rodent2() {
		print("Rodent constructor");
	}
	public void hop() {
		print("Rodent hopping");
	}
	public void scurry() {
		print("Rodent scurrying");
	}
	public void reproduce() {
		print("Making more Rodents");
	}
	public String toString() {
		return "Rodent";
	}
}

class Mouse2 extends Rodent2 {
	Member m1 = new Member("m1"), m2 = new Member("m2");
	public Mouse2() {
		print("Mouse constructor");
	}
	public void hop() {
		print("Mouse hopping");
	}
	public void scurry() {
		print("Mouse scurrying");
	}
	public void reproduce() {
		print("Making more Mice");
	}
	public String toSTring() {
		return "Mouse";
	}
}

class Gerbil2 extends Rodent2 {
	Member m1 = new Member("g1"),m2 = new Member("g2");
	public Gerbil2() {
		print("Gerbil constructor");
	}
	public void hop() {
		print("Gerbil scurrying");
	}
	public void scurry() {
		print("Gerbil scurrying");
	}
	public void reproduce() {
		print("Making more Gerbils");
	}
	public String toString() {
		return "Gerbil";
	}
}

class Hamster2 extends Rodent2{
	Member m1 = new Member("h1"), m2 = new Member("h2");
	public Hamster2() {
		print("Hamster constructor");
	}
	public void scurry() {
		print("Hamster scurrying");
	}
	public void reproduce() {
		print("Making more Hamsters");
	}
	public String toString() {
		return "Hamster";
	}
}

public class E12RodentInitialization {
	
	public static void main(String[] args) {
		
		new Hamster2();
	}
	
}

//我们首先初始化基类，首先按照定义的顺序从成员对象开始，然后再初始化派生的类，从其成员对象开始。

/* Outout:
Member constructor r1
Member constructor r2
Rodent constructor
Member constructor h1
Member constructor h2
Hamster constructor
 *///





