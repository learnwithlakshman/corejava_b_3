package com.lwl.cj.day30;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

interface Greetings {
	String message();
}

class BGreetings implements Greetings {

	@Override
	public String message() {

		return "Messge from " + this.getClass().getSimpleName();
	}

}

class NGreetings implements Greetings {

	@Override
	public String message() {
		return "Messge from " + this.getClass().getSimpleName();
	}

}

public class ReflectionAPI {
	public static void main(String[] args) {

		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("db.properties"));
			String clsName = properties.getProperty("greetings");
			Class c = Class.forName(clsName);
			Greetings obj = (Greetings) c.newInstance();
			System.out.println(c.getMethod("message", null).invoke(obj, null));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	
}
