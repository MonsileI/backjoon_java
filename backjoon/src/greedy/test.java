package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String doc = br.readLine();
	String word = br.readLine();
	int count = 0;
	
	while(doc.length()>0){
		
		if(doc.startsWith(word)) {
			
			doc = doc.substring(word.length());
			count++;
		}else {
			
			doc = doc.substring(1);
			
		}
		
		
	}
	System.out.println(count);
	
	}
}
