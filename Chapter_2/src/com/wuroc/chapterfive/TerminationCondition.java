//: Book.java

package com.wuroc.chapterfive;

import com.wuroc.onjava.Nap;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月10日
 *
 * 
 */

class Book{
boolean checkedOut = false;
	
	Book(boolean checkOut) {
		
		checkedOut = checkOut;
	}
	
	void checkIn() {
		
		checkedOut = false;
	}
	
	@Override
	protected void finalize() throws Throwable{
		
		if (checkedOut) {
			
			System.out.println("Error: checked out");
			
		}
		
	}
}
public class TerminationCondition {
	
	public static void main(String[] args) {	
		
	Book novel = new Book(true);
	
	novel.checkIn();
	
	new Book(true);
	
	System.gc();
	
	new Nap(1);
	
	
	}
	
	
	

}







