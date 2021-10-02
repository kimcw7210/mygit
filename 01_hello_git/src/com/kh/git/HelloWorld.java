package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.foo.Foo;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World~");
		System.out.println("Hello Git~");
		System.out.println("Good luck~");

		new Foo().sayFoo();
		new Foo().sayFoo(); // #sayFoo에서 추가.

		System.out.println("Lucky you~"); // #master 에서 추가.
		
		new Dog().say();
		new Cat().say();

	}
}