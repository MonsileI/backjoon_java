package Programmers_Level_1;


import java.util.Arrays;

public class numberK {
	
	public static void main(String[] args) {
		
		int[]array = {1,2, 5, 2, 6, 3, 7, 4};
		int[][]commands = {
				{2,5,3},{4,4,1},{1,7,3}
					
		};
		
		int[]answer = new int[commands.length];

		
		int begin = 0;
		int end = 0;
		
		for(int i=0;i<commands.length;i++) {
			
			begin = commands[i][0]-1;
			end = commands[i][1];
			
			int[] temp = Arrays.copyOfRange(array, begin, end);
		
			Arrays.sort(temp);
			
			answer[i] = temp[commands[i][2]-1];
			
			
			System.out.println(answer[i]);
		}
		
		
		
		
		
		
		
	}

}
