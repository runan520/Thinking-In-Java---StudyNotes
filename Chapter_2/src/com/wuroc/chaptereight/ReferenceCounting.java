//: ReferenceCounting.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年8月20日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = 0;
	
	Shared() {
		System.out.println("Creating " + this);
	}
	
	public void addRef() {
		refcount++;
	}
	
	protected void dispose() {
		if (--refcount == 0) {
			System.out.println("Disposinig " + this);
		}
	}
	
	@Override
	public String toString() {
		return "Shared " + id;
	}
	
}
class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	
	Composing(Shared shared){
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	
	protected void dispose() {
		System.out.println("disposeing " + this);
		shared.dispose();
	}
	
	@Override
	public String toString() {
		return "Composing " + id;
	}
}

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = {
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				
		};
		
		for (Composing c : composing) {
			c.dispose();

		}


	}

}








