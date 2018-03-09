package com.hl.工厂模式;

public class Test {
	public static void main(String[] args) {
		Rectangle rectangle = (Rectangle) ShapeFactory.getClass(Rectangle.class);
		rectangle.draw();
		Square square = (Square) ShapeFactory.getClass(Square.class);
		square.draw();
	}
}
