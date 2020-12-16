package week1.day2;

import java.util.Arrays;

public class RemoveDuplicates {
	
		public static void main(String[] args) {
	
		int num[] = {4,6,4,2,9,2,8,10};
		Arrays.sort(num);
	int size = num.length;
	int temp;
	for(int i = 0;i<size;i++) {
		temp =0;
		for (int j=i+1;j<num.length;j++){
			if (num[i] == num[j]) {
				temp =temp+1;
				
			}
			}
		if(temp ==0) {
				System.out.println(num[i]+"");
			}
		}
		
	}

	}		

