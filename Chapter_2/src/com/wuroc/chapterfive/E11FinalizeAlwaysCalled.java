//: E11FinalizeAlwaysCalled.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 *
 * 
 */
public class E11FinalizeAlwaysCalled {
	protected void finalize() {
		System.out.println("finalize() called[]");;
		
	}
	public static void main(String args[]) {
		new E11FinalizeAlwaysCalled();
		System.gc();
		System.runFinalization();
	}
}
/*Output
 * 
 * finalize() called[]
 */
/* question:Modify Exercise 10 so your finalize() will always be called.
 * Calling System. gc() and System.
 *runFinalization() in sequence will probably but not necessarily call your finalizer (The behavior of finalize has been uncertain from one version of JDK to another.)
 *The call to these methods is just a request;
 *it doesn't ensure the finalizer will actually run.
 *Ultimately, nothing guarantees that finalize() will be called.
 *
 */





