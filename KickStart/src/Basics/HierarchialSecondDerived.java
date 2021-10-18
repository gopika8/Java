package Basics;
import Basics.HierarchialInheritance;

public class HierarchialSecondDerived extends HierarchialInheritance{
	public static void main(String args[]){
		HierarchialSecondDerived hsd = new HierarchialSecondDerived();
		System.out.print(hsd.appendString() + ", in second derived");
	}
}
