package Programmers_Level_1;



public class lottos_2021_Dev_Matching {

	public static void main(String[] args) {
		
	int[]lottos = {44, 1, 0, 0, 31, 25};
	int[]win_nums = {31, 10, 45, 1, 6, 19};
	
	
	int Cnum=0;
	int good=0;
	
	for(int i=0;i<6;i++) {
		
		if(lottos[i]==0) {
			good++;
		}
		
		for(int j=0;j<6;j++) {
			
			if(lottos[i]==win_nums[j]) {
				Cnum++;
				good++;
				
			}
			
		}
		
	}
	int yes = good;
	int no = Cnum;
	
	
	
	if(yes>=6) {
		yes=1;
	}else if(yes>=5) {
		yes=2;
	}else if(yes>=4) {
		yes=3;
	}else if(yes>=3) {
		yes=4;
	}else if(yes>=2) {
		yes=5;
	}else {
		yes=6;
		
	}if(no>=6) {
		no=1;
	}else if(no>=5) {
		no=2;
	}else if(no>=4) {
		no=3;
	}else if(no>=3) {
		no=4;
	}else if(no>=2) {
		no=5;
	}else {
		no=6;
	}
	
	System.out.println(yes + " " + no);
	
	}
}
