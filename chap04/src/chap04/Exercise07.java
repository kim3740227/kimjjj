package chap04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		String inputString1 = null;
		String inputString2 = null;
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			
			String inputString = scanner.nextLine();
			if("1".equals(inputString)) {
				System.out.print("예금액> ");
				inputString1 = scanner.nextLine();
			}else if("2".equals(inputString)) {
				System.out.print("출금액> ");
				inputString2 = scanner.nextLine();
			}else if("3".equals(inputString)) {
				System.out.print("잔고> ");
				int money = balance + Integer.parseInt(inputString1) - Integer.parseInt(inputString2); //balance + 예금액  - 출금액이 계산되도록
				System.out.println(money);
				
			}else if("4".equals(inputString)){
				System.out.println("");
				System.out.println("프로그램 종료");
				break;
			}
		}	
	}

}
