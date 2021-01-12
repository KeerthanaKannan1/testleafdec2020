package week1.day1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int prime = 10;
		int count = 0;
		
		for (int i = 1; i <= prime ; i++) {
			if (prime % i == 0 ) {
				count = count + 1;			
			}
			if (count == 2)

{
				System.out.println(prime + "yes");
			}
			else {
				System.out.println(prime + "no");
			}
	}
	}

	}
	
