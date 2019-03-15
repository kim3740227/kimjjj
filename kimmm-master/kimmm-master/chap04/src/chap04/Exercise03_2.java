package chap04;

public class Exercise03_2 {
	public static void main(String[] args) {
		//1~100까지의 정수 중에서 3의 배수의 총합 구하기
		int sum = 0;
		int i = 1;
		
		while(i <= 100) { //i가 백보다 작거나 같고
			while(i % 3 == 0){ //i를 3으로 나눈 나머지가 0일 때
				sum += i; //sum에 i를 더함
				break;
			}
			i++; //i를 3으로 나눈 나머지가 0이 아니여도 i가 100보다만 작으면 i+1
		}
		System.out.println(sum);
	}

}
