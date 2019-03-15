package chap04;

public class Exercise03 {
	public static void main(String[] args) {
		//1~100까지의 정수 중에서 3의 배수의 총합 구하기
		int sum = 0; //sum 초기화
		
		for(int i = 0;i<=100;i=i+3) { //i=0부터 3씩 커지도록
			sum += i;
		}
		System.out.println(sum);
	}

}
