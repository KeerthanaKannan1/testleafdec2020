package week1.day1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int prime = 13;
		boolean flag = false;
		
		for (int i = 2; i <= prime / 2; i++) {
			if (prime % i == 0 ) {
				flag = true;
				break;
				
			}
			if (flag == false)
			{
				System.out.println(prime + "yes");
			}else {
				System.out.println(prime + "no");
			}
	}
	}

	}
	
