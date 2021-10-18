package Basics;


class SingleIheritanceSuperClass {
	private String sampleData;
	public SingleIheritanceSuperClass(String data){
		this.sampleData = data;
	}
	public void printData(){
		System.out.print(sampleData);
	}
}

public class SingleInheritance extends SingleIheritanceSuperClass{
	public SingleInheritance(String data){
		super(data);
	}
	
	public static void main(String args[]){
		SingleInheritance singleInheritance = new SingleInheritance("Sending data from child to parent");
		singleInheritance.printData();
	}
}


