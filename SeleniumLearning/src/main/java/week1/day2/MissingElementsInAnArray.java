package week1.day2;

import java.util.Arrays;

public class MissingElementsInAnArray {
	
	
	public static void main(String[] args) {
		
		int[] number = new int[]{1,2,3,4,7,6,8};
		
		Arrays.sort(number);
	
		for (int i = 0; i < number.length;i++) {
			if( number[i] != i+1) {
				System.out.println(i+1);
				break;
		}
	
		
	}
	
	
		
		
	
			
		}
				
}