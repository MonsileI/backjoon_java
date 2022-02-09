package greedy;



import java.util.Scanner;


public class no_4796 {

	public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in);
	
	String str = scan.next();
	int num = 0;
	
	while(!str.equals("0 0 0")) {
		num++;
		String Num[] = str.split("\\s");
		System.out.println(Num[0]);
		int L = Integer.parseInt(Num[0]);
		int P = Integer.parseInt(Num[1]);
		int V = Integer.parseInt(Num[2]);
		
		
		int result=0;
		int last = V%P;
		
		if(L>=last) {
			
			result = ((V/P)*L) + last;
		}else {
			result = ((V/P)*L) + L;
			
		}
		
		System.out.println("Case "+num+": "+result+"\n");
		str = scan.next();
		
		
	}
	

	}
}
