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
			System.out.println("1.���� |2.��� |3.�ܰ� |4.����");
			System.out.println("-----------------------");
			System.out.print("����> ");
			
			String inputString = scanner.nextLine();
			if("1".equals(inputString)) {
				System.out.print("���ݾ�> ");
				inputString1 = scanner.nextLine();
			}else if("2".equals(inputString)) {
				System.out.print("��ݾ�> ");
				inputString2 = scanner.nextLine();
			}else if("3".equals(inputString)) {
				System.out.print("�ܰ�> ");
				int money = balance + Integer.parseInt(inputString1) - Integer.parseInt(inputString2); //balance + ���ݾ�  - ��ݾ��� ���ǵ���
				System.out.println(money);
				
			}else if("4".equals(inputString)){
				System.out.println("");
				System.out.println("���α׷� ����");
				break;
			}
		}	
	}

}
