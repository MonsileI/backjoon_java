package greedy;

import java.util.Scanner;

public class no_2864 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	String A = scan.next();
	String B = scan.next();
	String minA = "";
	String maxA = "";
	String minB = "";
	String maxB = "";
	
	for(int i=0;i<A.length();i++) {
		
		if(A.charAt(i) == '6') {
			minA = minA+"5";
			
		}else {
			minA = minA+A.charAt(i);
		}
		
		if(A.charAt(i)=='5') {
			maxA = maxA+"6";
		}else {
			minA=minA+A.charAt(i);
		}
		
	}
	
	for(int i=0;i<B.length();i++) {
		
		if(B.charAt(i) == '6') {
			minB = minB+"5";
			
		}else {
			minB = minB+B.charAt(i);
		}
		
		if(B.charAt(i)=='5') {
			maxB = maxB+"6";
		}else {
			minB=minB+B.charAt(i);
		}
		
	}
	
	int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
	int min = Integer.parseInt(minA) + Integer.parseInt(minB);
	
	System.out.println(max + " " + min);
	
	
	
	}
}
