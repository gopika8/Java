package Basics;

public class RunTimePolymorphism extends Polymorphism{
	
	public void claculation(int data){
		System.out.println(data+100);
	}
	
	public void printMyName(){
		System.out.println("Hi this is me");
	}
	
	public static void main(String args[]){
		RunTimePolymorphism rtp = new RunTimePolymorphism();
		rtp.claculation();
		rtp.claculation(100);
		Polymorphism poly = (Polymorphism) rtp;
		poly.claculation(100);
	}
}
