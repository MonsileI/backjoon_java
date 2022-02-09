package greedy;




import java.util.Scanner;


public class no_16953 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	long A = scan.nextLong();
	long B = scan.nextLong();
	
	int result= 1;
	
	while(B!=A) {
		if(B<A) {
			result = -1;
			break;
			
		}
		
		String str = String.valueOf(B);
		
		if(str.charAt(str.length() - 1) != '1' && B%2 !=0) {
			result = -1;
			break;
		}
		
		if(B%2==0) {
			//2의 배수면 나누고,
			B = B/2;
		}else {
			//마지막 값이 1인걸 없애는거지 B가 A가 되어야 하니까
			str = str.substring(0, str.length() -1);
			B= Long.parseLong(str);
		}
		
		result++;
		
	}
	System.out.println(result);
	

	}
}
