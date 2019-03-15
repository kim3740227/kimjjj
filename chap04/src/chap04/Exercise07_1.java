package chap04;

import java.util.Scanner;

public class Exercise07_1 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		String inputString1 = null;
		String inputString2 = null;
		Outter : while(run) {			//while문 종료시키기 위해서 이름 지정
			System.out.println("-----------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			
			String inputString = scanner.nextLine();
			
			switch(inputString) {
			case "1":
				System.out.print("예금액> ");
				inputString1 = scanner.nextLine();
				break;
			case "2":
				System.out.print("출금액> ");
				inputString2 = scanner.nextLine();
				break;
			case "3":
				System.out.print("잔고> ");
				int money = balance + Integer.parseInt(inputString1) - Integer.parseInt(inputString2);
				System.out.println(money);
				break;
			case "4":
				System.out.println("프로그램 종료");
				//run = false;
				break Outter;
				
			}
			
			
			
			/*if("1".equals(inputString)) {
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
			}*/
		}	
	}


}
