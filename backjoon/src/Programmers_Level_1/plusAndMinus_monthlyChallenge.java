package Programmers_Level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class plusAndMinus_monthlyChallenge {

	public static void main(String[] args) throws IOException {
		
	int[] numbers = {5,7,12};
	
	boolean []signs = {true,false,true};
	int result = 0;
	int plus =0;
	int mis = 0;
	for(int i=0;i<numbers.length;i++) {
		
		if(signs[i] == true) {
			plus += numbers[i];
			
			
		}else {
			mis += numbers[i];
		}
		
	}

	result = plus -(mis);
	
	
	System.out.println(result);
	
		
	
	
	}
}

	