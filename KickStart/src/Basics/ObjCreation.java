package Basics;

public class ObjCreation {
	private String nameOfAPerson;
	private int ageOfAPerson;
	private String numberOfAPerson;
	
	//default constructor
	
	public ObjCreation() {
		
	}
	
	//parameterized constructor
	
	public ObjCreation(String name, int age, String number){
		this.nameOfAPerson = name;
		this.ageOfAPerson = age;
		this.numberOfAPerson = number;
	}
	
	public void printValues(){
		System.out.println(nameOfAPerson + "," +ageOfAPerson + "," + numberOfAPerson);
	}
	
	
	public static void main(String args[]){
		ObjCreation parameterizedObj = new ObjCreation("gopika", 22, "9943052010");
		ObjCreation defaultObj = new ObjCreation();
		parameterizedObj.printValues();
		defaultObj.nameOfAPerson = "VimalaDevi";
		defaultObj.ageOfAPerson = 45;
		defaultObj.numberOfAPerson = "992090728";
		defaultObj.printValues();
	}
}
