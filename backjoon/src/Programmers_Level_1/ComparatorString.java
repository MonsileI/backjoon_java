package Programmers_Level_1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorString {

	public static void main(String[] args) {

		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				//더 공부가 피료해..
				return s1.charAt(n) - s2.charAt(n) !=0 
				? s1.charAt(n) - s2.charAt(n) : s1.compareTo(s2);
			}
			
		});
		
		for(int i=0;i<strings.length;i++) {
			
			System.out.println(strings[i]);
		}
		
		
	}
}
