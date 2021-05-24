package random;

import java.util.Random;

public class Lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String food[] = {
				"순대국","짬뽕","마라탕","맘터","김밥천국"
		};
		int cnt[] = new int[food.length];
		for (int i = 0; i < 10000; i++) {
			int num = (int)(Math.random()*food.length);
			for (int j = 0; j < food.length; j++) {
				if(j==num) {
				cnt[j]++;
				}
			}
		
		}
		int max = cnt[0],voteNum = 0;
		for (int i = 0; i < cnt.length; i++) {
			if(max < cnt[i]) {
				max = cnt[i];
				voteNum = i;
			}
		}
		
		System.out.print("가장많은 득표수"+ max+"기호번호는"+(voteNum+1));
		for (int i = 0; i < food.length; i++) {
			if(voteNum == i)
				System.out.print(" "+ food[i]);
		}
	
	
	
	}
}

	