package week1.day2;

public class LargestNumber {

	public static void main(String[] args) {
		int temp, size; 
		int num[] = {3,2,11,4,6,7};
	
		size = num.length;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] =num[j];
					num[j] = temp;
				}
			}
		}
System.out.println("largest number is" +num[size-2]);

	}

}

