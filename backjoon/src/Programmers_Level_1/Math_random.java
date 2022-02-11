package Programmers_Level_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Math_random {
	
	public static void main(String[] args) {
		
		int[]array = {1,2,3,4,5};

		
		ArrayList<Integer> list = new ArrayList<>();
		//1 12345 12345
		//2 21232425 21232425
		//3 3311224455 3311224455
		
		int[]one = {1,2,3,4,5};
		int[]two = {2,1,2,3,2,4,2,5};
		int[]thr = {3,3,1,1,2,2,4,4,5,5};
		int[]score = new int[3];
	
		for(int i=0;i<array.length;i++) {
			
			if(one[i%5]==array[i]) {
				score[0]++;
			}else if(two[i%8]==array[i]) {
				score[1]++;
				
			}else if(thr[i%10]==array[i]) {
				score[2]++;
				
			}
		
		}
		
		int arr[] = new int[score.length];
		
		for(int i=0;i<score.length ; i++) {
			
			arr[i] = i;
			
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++){
            if(score[i] == arr[2]){
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
		System.out.println(answer);
	}

}
