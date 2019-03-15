package chap04;

public class Exercise06_1 {

	public static void main(String[] args) {
		/*  *
		**
		***
		****
		*****
	    ¸¸µé±â */
		String A = "*";
		for(int i = 1;i<=5;i++) {
			int num = A.length() * i;
			System.out.println(A * num);
		}
	}

}
