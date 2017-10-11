package dely2p.numberbaseballgame;

import java.util.Scanner;

public class Prompt {
	public static boolean isPlay = true;
	
	public void print_Prompt() {
		System.out.println("숫자를 입력해주세요 ex)123 : ");
		
	}
	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		NumberBaseBall baseball = new NumberBaseBall();
		String answerNum = baseball.makeRandomNum();
		/*정답 숫자 - 테스트 시 사용*/
		//System.out.println("answerNum: "+answerNum);
		
		while(isPlay) {
			print_Prompt();
			String userNum = scan.next();
			baseball.compareToNum(userNum);
			isPlay=baseball.print_Check();
		}
	}	
	
	public static void main(String[] args) {
		Prompt pt = new Prompt();
		pt.runPrompt();
	}
}
