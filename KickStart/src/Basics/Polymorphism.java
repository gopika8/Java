package Basics;

public class Polymorphism {
	
	private int celcius;
	
	public Polymorphism(){
		
	}
	
	public Polymorphism(int data){
		this.celcius = data;
	}
	
	public void claculation(){
		System.out.println((celcius * (9/5))+32+"F");
	}
	
	public void claculation(int celciusData){
		System.out.println((celciusData * (9/5))+32+"F");
	}
	
	public static void main(String args[]){
		Polymorphism poly = new Polymorphism();
		new Polymorphism(43);
		poly.claculation();
		poly.claculation(20);
	}
}
