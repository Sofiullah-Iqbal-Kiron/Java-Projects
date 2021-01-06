// JNIStringTest.java
package com.Practice.Swing.SwingTutorialBooksCode.jdojo.jni;

public class JNIStringTest {
	static {
		System.loadLibrary("beginningjava");
	}

	public native void printMsg(String msg);

	public native String getMsg();

	public static void main(String[] args) {
		JNIStringTest stringTest = new JNIStringTest();

		String javaMsg = "Hello from Java to JNI";
		stringTest.printMsg(javaMsg);

		String nativeMsg = stringTest.getMsg();
		System.out.println(nativeMsg);
	}
}
