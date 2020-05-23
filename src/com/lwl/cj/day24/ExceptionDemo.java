package com.lwl.cj.day24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class C1 {
	public List<String> readAllLines(String filePath) throws IOException {
		List<String> list = Files.readAllLines(Paths.get(filePath));
		return list;
	}
}

class C2 extends C1 {
	public void showOnlyNames(String filePath) throws IOException {
			List<String> list = readAllLines(filePath);
			for(String data:list) {
				System.out.println(data.split(",")[1]);
			}
	}
}

public class ExceptionDemo {
	public static void main(String[] args)  {
		String fileName = "emp.txt";
		C2 obj = new C2();
		try {
			obj.showOnlyNames(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//.......
		System.out.println("End of the main method");
	}
}
