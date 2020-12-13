package week1.day1;

public class FibonacciSeries {

	
	public static void main(String[] args) {
		
		int a = 8 ;
		int i = 1,b= 0;
		
		for(int c =1; c <= a; ++c) {
			System.out.println(b + " +");
			int sum = b+i;
			
			b=i;
			i=sum;
			
		}
		
		
	}
}
