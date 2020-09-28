//Sequence3.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
class Sequence3 {
	private Object[] objects;
	private int next;
	public Sequence3(int size) {
		objects = new Object[size];
	}
	public void add(Object x) {
		if(next < objects.length)
			objects[next++] = x;
		
	}
	//如果不使用内部类，这Sequence只能有一个Selector。
	private class ReverseSelector implements Selector {
		int i = objects.length - 1;

		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i < 0;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return  objects[i];
		}

		@Override 
		public void next() {
			// TODO Auto-generated method stub
			if(i >= 0) 
				i--;
		}		
	}
	private class SequenceSelector implements Selector{
		private int i = objects.length - 1;

		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == objects.length;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return objects[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i < objects.length)
				i++;
		}
		
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public Selector reverseSelector() {
		return new ReverseSelector();
	}

}

public class E22GetRSelector{
	public static void main(String[] args) {
		Sequence3 sequence = new Sequence3(10);
		for(int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		//这里有两个Selector可以调用
		Selector selector = sequence.reverseSelector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		
	}
	
}

