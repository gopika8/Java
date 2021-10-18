package Basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation implements Cloneable {

	public void printMyName(){
		System.out.println("My name is Gopika");
	}
	
	public static void main(String args[]){
	//new keyword
	ObjectCreation obj = new ObjectCreation();
		
	//using the newInstance method of class Class
	try {
		ObjectCreation objInstance = ObjectCreation.class.newInstance();
		objInstance.printMyName();
	} catch (InstantiationException e1) {
		e1.printStackTrace();
	} catch (IllegalAccessException e1) {
		e1.printStackTrace();
	}
	
	//using newInstance method of Constructor class
		try {
			Constructor<ObjectCreation> objCons = ObjectCreation.class.getConstructor();
			ObjectCreation objConst;
			try {
				objConst = objCons.newInstance();
				objConst.printMyName();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		
		//using clone method of clone - able interface
		try {
			ObjectCreation objCloned = (ObjectCreation) obj.clone();
			objCloned.printMyName();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		obj.printMyName();
	}
}
