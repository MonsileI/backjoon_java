package Today_22_04_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class zero {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		
		Stack<Integer> heap = new Stack<>();
		
		for(int i=0;i<k;i++) {
			
			int num = Integer.parseInt(br.readLine());
			
			if(!heap.isEmpty()&&num==0) heap.pop();
			else heap.add(num);
			
			
		}
		System.out.println(heap);
		int sum = 0;
		while(!heap.isEmpty()) sum+= heap.pop(); 
		
		System.out.println(sum);
	}

}
