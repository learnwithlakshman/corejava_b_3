package com.lwl.cj.day29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadingProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("db.properties"));
		
		properties.entrySet().forEach(e->{
			System.out.println(e.getKey()+":"+e.getValue());
		});
		
	}
}
