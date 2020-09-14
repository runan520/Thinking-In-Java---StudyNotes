//: SpaceShipDelegation.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月18日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	public void back(int velocity) {
		controls.back(velocity);
	}
	/**
	 * 
	 */
	public void down(int velocity) {
		controls.down(velocity);		
	}
	public void forward(int velocity) {
		controls.forward(velocity);
	}
	public void left(int velocity) {
		controls.left(velocity);
	}
	public void right(int velocity) {
		controls.right(velocity);
	}
	public void up(int velocity) {
		controls.up(velocity);
	}
	public static void main(String[] args) {
		SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
		protector.forward(100);
	}

}
