package dely2p.numberbaseballgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberBaseBall {
	boolean isContain = false;
	String answerNum = "";
	String userNum = "";
	int strike,ball;
	
	public String makeRandomNum() { 		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<10;i++) { //make suffle num
			list.add(i);
			Collections.shuffle(list);
		}		
		for(int j=0;j<3;j++) { //get 3 num
			answerNum += list.get(j);					
		}
		return answerNum;
	}	
	
	public void compareToNum(String userNum) {
		this.userNum = userNum;
		for(int i=0;i<3;i++) {
			if(answerNum.contains(userNum.substring(i, i+1))) {
				if(answerNum.charAt(i)==userNum.charAt(i)){ //
					strike++;
				}else if(answerNum.charAt(i)!=userNum.charAt(i)) {
					ball++;
				}
			}
		}
	}
	
	public boolean print_Check() {
		if(strike>0 && ball>0) System.out.println(strike+"스트라이크 "+ball+"볼");
		else if(strike>0) {
			System.out.println(strike+"스트라이크 ");
			if(strike>2) {
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료"); return false;
			}
		}else if(ball>0) System.out.println(ball+"볼");
		else System.out.println("낫싱");
		strike=0; ball=0;
		return true;
	}
}
