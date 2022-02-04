package com.cts.designpatterns;

public class FactoryPattern {
	
	public Shape getShape(String ShapeType ) {
		
		if(ShapeType==null) {
			return null;
		}
		else if(ShapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		else if(ShapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		else if(ShapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryPattern fp=new FactoryPattern();
		Shape s1=fp.getShape("circle");
		s1.print();
		
		Shape s2=fp.getShape("square");
		s2.print();
		
		Shape s3=fp.getShape("rectangle");
		s3.print();

	}

}
