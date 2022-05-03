package Recursion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요 : ");
		int firstNum = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int secondNum = sc.nextInt();

		int result = calculatePower(firstNum, secondNum);
		System.out.printf("결과값 : %d ", result);
		
		
	}

	private static int calculatePower(int firstNum, int secondNum) {
		
		// 재귀 탈출 조건
		// 첫번째수가 뭐가 오든간에 그 수의 0제곱값은 1이다.
		if (secondNum == 0) {
			return 1;
		}
		
		// 이렇게 해도됨
		// if (secondNum == 1) {
		// return firstNum;
		// }
		
		// 첫번째 입력받은수 x 두번째 입력받은수가 0이 될때까지 반복
		return firstNum * calculatePower(firstNum, secondNum - 1);
	}

}
