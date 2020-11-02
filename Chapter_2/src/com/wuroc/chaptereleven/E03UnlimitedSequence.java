//E03UnlimitedSequence.java
package com.wuroc.chaptereleven;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RocWu
 *
 */
interface Selector{
	boolean end();
	Object current();
	void next();
}
class UnlimitedSequence {
	private final List<Object> items = new ArrayList<Object>();
	public void add(Object x) {
		items.add(x);
	}
	private class SequenceSelector implements Selector {
		private int i;
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == items.size();
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items.get(i);
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i < items.size())
				i++;
		}
		
	}
	public Selector selector() {
		return new SequenceSelector();
	}
}
public class E03UnlimitedSequence {
	public static void main(String[] args) {
		UnlimitedSequence sequence = new UnlimitedSequence();
		for(int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
//Output:
//0 1 2 3 4 5 6 7 8 9 