package Basics;
import java.util.Scanner;

class MultilevelInheritanceSuperSuper {
	public void Addition(int number1, int number2){
	System.out.println(number1+number2);
	}
	private String SampleString = "Base super class";
	protected void printString(){
		System.out.println(SampleString);
	}
}

class MultilevelInheritanceSuper extends MultilevelInheritanceSuperSuper{
	public void Multiplication(int number1, int number2){
	System.out.println(number1*number2);
	}
}


public class MultilevelInheritance extends MultilevelInheritanceSuper{
	public static void main(String args[]){
		int number1, number2;
		Scanner scanner = new Scanner(System.in);
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		MultilevelInheritance multilvl = new MultilevelInheritance();
		multilvl.Multiplication(number1, number2);
		multilvl.Addition(number1, number2);
		multilvl.printString();
		scanner.close();
	}
	
}
