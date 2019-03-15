package chap04;

public class Exercise03_1 {
	public static void main(String[] args) {
		//1~100까지의 정수 중에서 3의 배수의 총합 구하기
		int sum = 0; //sum 초기화
		
		for(int i=0;i<=100;i++) {
			if(i % 3 == 0) { //나머지가 0일 때만 sum에 더함
				sum += i;
			}
			/*
			if(i % 3 != 0) {
				continue;
			}else {
				sum += i;
			}     // continue이용해서 if문 사용하기 
			*/
		}
		System.out.println(sum);
	}

}
