package week1.day1;
import java.util.Scanner;
public class Factorial {

	
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in) ;
		System.out.println("enter the number = ");
		int a = scan.nextInt();
		int i,fact = 1;
		
		
		for(i=1;i<=a;i++) {
			fact = fact*i;
			
		}
		System.out.println("factorial is" +fact);
	}
}
