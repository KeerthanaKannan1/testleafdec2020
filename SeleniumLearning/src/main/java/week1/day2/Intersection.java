package week1.day2;

public class Intersection {
	
	public static void main(String[] args) {
	int[] num1 = {4,6,5,3,9};
	int[] num2 = {4,6,5,3,7};
	
	for(int i= 0;i< num1.length;i++) {
			for(int j=0;j<num2.length;j++) {
			if(num1[i] ==num2[j]) {
				System.out.println(+num1[i]);
			}
		}
		
	}
	}
}
	

