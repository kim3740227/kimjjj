package chap04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			
			String inputString = scanner.nextLine();
			if(inputString.equals("1")) {
				System.out.print("예금액> ");
				String inputString1 = scanner.nextLine();
			}else if(inputString.equals("2")) {
				System.out.print("출금액> ");
				String inputString2 = scanner.nextLine();
			}else if(inputString.equals("3")) {
				System.out.print("잔고> ");
				int money = balance + (int)inputString1 - (int)inputString2; //balance + 예금액  - 출금액이 계산되도록
				System.out.println(money);
				
			}else if(inputString.equals("4")){
				System.out.println("");
				System.out.println("프로그램 종료");
				break;
			}
		}	
	}

}
