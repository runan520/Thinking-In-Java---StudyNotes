//Sequence.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
interface Selector2{
	boolean end();
	Object current();
	void next();
}

class Sequence2 {
	private Object[] items;
	private int next = 0;
	public Sequence2(int size) {
		items = new Object[size];
		
	}
	
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	
	private class SequenceSelector2 implements Selector2 {
		private int i = 0;
		
		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if(i < items.length)
				i++;
		}
		
		public Sequence2 sequence() {
			return Sequence2.this;
		}
		
	}
	
	
	
	public Selector2 selector() {
		return new SequenceSelector2();
	}
	
	public boolean check() {
		return this == ((SequenceSelector2)selector()).sequence();
	}
	
}
public class E04SequenceSlectorToSequence{
	public static void main(String[] args) {
		Sequence2 sequence = new Sequence2(10);
		System.out.println(sequence.check());
		}
	}

