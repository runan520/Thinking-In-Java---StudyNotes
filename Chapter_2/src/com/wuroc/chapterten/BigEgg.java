//bigEgg.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
class Egg {
	private Yolk y;
	protected class Yolk {
		public Yolk() {
		System.out.println("Egg.Yolk()");
	}
	}
	Egg(){
		System.out.println("New Egg()");
		y = new Yolk();
	}
}
	//无用
	public  class BigEgg extends Egg {
		public class Yolk {
			public Yolk() {
				System.out.println("BigEgg.Yolk()");
			}
		}
		
		public static void main(String[] args) {
			new BigEgg();
		}
	}

	/*Output:
	 * New Egg() 
	 * Egg.Yolk()
	 */
