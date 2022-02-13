package Programmers_Level_1;

import java.lang.StringBuffer;

public class TernaryBaseThree {
	
	public static void main(String[] args) {
		
	
	        int answer = 0;
	        int n = 45;
	        
	        String result="";
	        
	        while(n>0) {
	        	
	        	result = n%3+result;
	        	n = n/3;
	        	
	        }
	        
	        StringBuilder sb = new StringBuilder(result);
	        
	        result = sb.reverse().toString();
	        
	        answer = Integer.parseInt(result,3);
	        
	        System.out.println(answer);
	    }
	}
