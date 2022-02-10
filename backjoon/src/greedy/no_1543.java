

package greedy;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class no_1543 {

	public static void main(String[] args) throws IOException  {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String doc = br.readLine();
	String search = br.readLine();
	
	int cnt=0;
	while(doc.length()>0) {
		if(doc.startsWith(search)) {
			cnt++;
			doc = doc.substring(search.length());
		}else {
			doc = doc.substring(1);
		}
		
	}
	
	System.out.println(cnt);
	}
}

