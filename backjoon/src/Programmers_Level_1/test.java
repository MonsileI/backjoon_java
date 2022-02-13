package Programmers_Level_1;

public class test {

	public static void main(String[] args) {
		
		int n =5;
		
		int[]arr1 = {9, 20, 28, 18, 11};
		int[]arr2 = {30, 1, 21, 17, 28};
		
		String[]newArr1 = new String[n];
		String[]newArr2 = new String[n];
		
		for(int i=0;i<n;i++) {
			String a = Integer.toBinaryString(arr1[i]);
			String b = Integer.toBinaryString(arr2[i]);
			if(a.length()<5) {
				while(a.length()<5) {
					a = "0"+a;
				}
			}
			if(b.length()<5) {
				while(b.length()<5) {
					b = "0"+b;
				}
			}
			newArr1[i] = a;
			newArr2[i] = b;
		}
	
		String[]answer = new String[n];
		
		int count=0;
		for(int i =0;i<n;i++) {
			
			for(int j = 0; j<5;i++) {
				
				count++;
				
				
			}
			
		}
		
		
		System.out.println(count);
	}
}
