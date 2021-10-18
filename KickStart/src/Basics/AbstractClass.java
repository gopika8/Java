package Basics;

abstract class AbstractClassBase {
	abstract void calculate();
	public String printAmAbstract(){
		return "I am from Abstract";
	}
}

class Circle extends AbstractClassBase{
	public Circle(){
		System.out.println("I am Circle");
	}
	void calculate(){
		System.out.println("Perimeter of circle = 2.pi.R");
	}
}

class Square extends AbstractClassBase{
	public Square(){
		System.out.println("I am Square");
	}
	void calculate(){
		System.out.println("Area of square = a.a");
	}
}

public class AbstractClass{
	public static void main(String args[]){
		AbstractClassBase  acb = new Circle();
		acb.calculate();
		System.out.println(acb.printAmAbstract());
		AbstractClassBase acbsquare = new Square();
		acbsquare.calculate();
		System.out.println(acbsquare.printAmAbstract());
	}
}
