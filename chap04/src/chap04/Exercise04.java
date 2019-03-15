package chap04;

public class Exercise04 {
	public static void main(String[] args) {
		//두개의 주사위를 던질 때 (x,y)의 합이 5가 나올 때까지 실행을 계속함
		int x = (int)(Math.random() * 5) + 1;
		int y = (int)(Math.random() * 5) + 1;
		int z = x + y;
		
		while(z != 5) {   									//z가 5가 아니면 
			System.out.println("(" + x + "," + y + ")");	//(x,y)형태로 출력하고
			x = (int)(Math.random() * 5) + 1;					//x에 다시 랜덤 값
			y = (int)(Math.random() * 5) + 1;					//y에 다시 랜덤 값 대입
			z = x + y;										//다시 더해서  while문 반복 
		}
		System.out.println("(" + x + "," + y + ")");		//while문이 5면 (x,y)값 출력 후 끝
	}

}
