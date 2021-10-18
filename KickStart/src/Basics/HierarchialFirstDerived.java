package Basics;
import Basics.HierarchialInheritance;

public class HierarchialFirstDerived extends HierarchialInheritance{
	public static void main(String args[]){
		HierarchialFirstDerived hfd = new HierarchialFirstDerived();
		System.out.print(hfd.appendString() + ", in first derived");
	}
}
