package com.lwl.cj.day22;

abstract class Shape {
	String color;

	Shape(String color) {
		this.color = color;
	}

	public String color() {
		return color;
	}

	public abstract void draw();
	
}

class Circle extends Shape {
	public Circle(String color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Circle draw method is called with color:" + color());
	}

}

public class AbstractClassExample {

	public static void main(String[] args) {
		Shape shape = new Circle("Green");
		shape.draw();
	}
}
