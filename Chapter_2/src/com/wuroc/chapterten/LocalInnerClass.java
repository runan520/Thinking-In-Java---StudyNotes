//LocalInnerClass.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
interface Counter {
	int next();
}
public class LocalInnerClass {
	private int count = 0;
	Counter getCounter(final String name) {
		class LocalCounter implements Counter {
			LocalCounter(){
				System.out.println("Localcounter()");
			}

			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		}
		return new LocalCounter();
	}
	Counter getCounter2(final String name) {
		return new Counter() {
			{
				System.out.println("Counter()");
			}

			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		};
	}
	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter
			c1 = lic.getCounter("Local inner "),
			c2 = lic.getCounter2("Anonymous inner");
		for(int i = 0; i < 5; i++)
			System.out.println(c1.next());
		for(int i = 0; i < 5; i++)
			System.out.println(c2.next());
	}
}

//所以使用局部内部类而不使用匿名内部类的另一个理由就是，需要不止一个该内部类的对象。


