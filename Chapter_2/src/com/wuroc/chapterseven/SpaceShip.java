//: SpaceShip.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月18日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class SpaceShip extends SpaceShipControls {
	private String name;
	public SpaceShip(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	public static void main(String[] args) {
		SpaceShip protector = new SpaceShip("NSEA Protrctor");
		protector.forward(100);
	} 

}
