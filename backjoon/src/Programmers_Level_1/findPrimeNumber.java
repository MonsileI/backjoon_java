package Programmers_Level_1;

public class findPrimeNumber {
	
	public static void main(String[] args) {
		
		int answer = 0;
        boolean flag = true;
        int n = 10;
        for (int i = 2; i <= n ; i++ ) {
            for (int j = 2; j <= Math.sqrt(i) ; j++ ) {
                if (  i % j == 0 ) {
                    flag = false; break;
                }
            }
            if(flag == true) answer++;
            flag = true; 
        }
  
        System.out.println(answer);
	}

}
