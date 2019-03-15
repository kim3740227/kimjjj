package exercise;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		int temp = 0;
		int[] arr = new int[5]; 
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0;i<5;i++) {
			System.out.print("arr[" + i + "]:");
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0; i<4;i++) {
			for(int k=1;k<5;k++) {
				if(arr[i]<arr[k]) {
					temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
			
		}
		System.out.println(arr);
				
				/*if(num > 0 && num <= 100) {
						System.out.print("arr[" + i + "]:");
						arr[i] = scanner.nextInt();
					
					}else {
						System.out.println("0~100사이의 값을 넣어주세요");
						run = false;
					}*/
			
	
	}

}
