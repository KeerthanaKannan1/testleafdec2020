package week1.day2;

public class Duplicates {

	public static void main(String[] args) {
		
		int num[] = { 11,12,18,18,12,13,11,14,19};
		int size;
		size = num.length;
		
		for(int i =0;i<num.length-1;i++) {
			for (int j=i+1;j<num.length;j++) {
				
				if(num[i]==num[j]&& i != j) {
					System.out.println("duplicates are" +num[j]);
				}
				
			}
		}
	}
}

