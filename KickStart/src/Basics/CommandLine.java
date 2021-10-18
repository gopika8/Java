package Basics;
import java.util.Scanner;
public class CommandLine {
	
//	public int findPosition(int A, int B, int T){
//		int endPosition = B;
//		while(T<0){
//			
//			T--;
//		}
//		return 0;
//	}
//	
//	public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int T = sc.nextInt();
//		System.out.print(new CommandLine().findPosition(A,B,T));
//		sc.close();
//	}
	
	public void arrange(int size, int[] array){
		int oddmax = 0, evenmax = 0;
		int initialsize = 0, finalsize = size;
		int temp[] = new int[size];
		while(size > 0){
		for(int i = 0; i < size; i++){
			if(array[i]/2 == 0 && array[i] > evenmax){
				evenmax = array[i];
			}
			if(array[i]/2 == 1 && array[i] > oddmax){
				oddmax = array[i];
			}
		}
		}
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0; i<n; i++){
			array[i] = sc.nextInt();
		}
		new CommandLine().arrange(n, array);
	}
}
