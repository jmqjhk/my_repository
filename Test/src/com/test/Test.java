package com.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("java.lang.reflect.Method");
			Field[] a = c.getDeclaredFields();
			for (Field s:a) {
				System.out.println("field name:"+s);
			}
			Method m[] = c.getDeclaredMethods();
			for (int i = 0; i < 3; i++) {
				System.out.println(m[i].toString());
			}
		} catch (Throwable e) {
			System.err.println(e);
		}
	}

}
