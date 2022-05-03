package Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();

		int s = factorial(n);
		System.out.printf("결과값 : %d ", s);

	}

	private static int factorial(int num) {
		
		// 곱하기 1은 무의미
		// 조건값이 1보다 작거나같으면 1을 리턴
		if (num <= 1)
        {
            return 1;
        }

		// 입력받은수 x 입력받은수 - 1 
		// 계속 돌다가 위 조건문에 걸리는 순간 탈출
        return num * factorial(num-1);
		
	}

}
