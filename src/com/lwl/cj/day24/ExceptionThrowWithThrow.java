package com.lwl.cj.day24;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.ws.WebServiceException;


class E1Excpetion extends Exception{
	
}
class E2Exception extends E1Excpetion{
	
}

class E3Exception extends E2Exception{
	
}




class Account{
	int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public void withDraw(int amount) throws E2Exception {
		if(amount > balance) {
			
		}
		balance -= amount;
	}
	
	public void transfer(int amount,String toAccount) throws InsufficientFundException {
		
		
	}
}

class SavingsAccount extends Account{

	public SavingsAccount(int balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withDraw(int amount) {
		
	}
	
}

class MyDb implements Closeable{

	void connect()throws IOException {
		System.out.println("Opend connection with my db");
	}
	@Override
	public void close() throws WebServiceException {
		System.out.println("Close my mb");
		
	}
	
}

public class ExceptionThrowWithThrow {
	public static void main(String[] args) {
		
		
		try (FileInputStream fis =new FileInputStream(new File("emp.txt"))){
			System.out.println("File.... Opened");
		}catch (IOException e) {
			System.out.println(e);
		}		
	}
}
