package Today_22_04_02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class usingForApart {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int [][] apart = new int[15][15];
	
		
		for(int i=0;i<t;i++) {
			
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
		
			//k층 n호
			System.out.println(el(k,n));
		
		} 
		
	}
	public static int el(int k,int n) {
		if(n==0) return 0;
		else if(k==0) return n;
		else {
			
			return el(k-1,n) + el(k,n-1);
			
		}
		
		
	}
}
