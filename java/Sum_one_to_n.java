package Recursion;

import java.util.Scanner;

public class Sum_one_to_n {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("숫자를 입력하세요 : ");
        int n = sc.nextInt();
        
        int s = sum(n);
        System.out.printf("결과값 : %d ", s);
        
    }// main

	
    public static int sum(int n) {
    	// n값이 1이되면 if문 탈출하고 종료
        if (n == 1) {
            System.out.println(n);
            return 1;
        } else if (n < 0) {	// 음수 입력시 그냥 실패했다는 의미로 -1 출력
        	return -1;
        } 
        
        System.out.print(n + " + ");
        // f(2) = 2 + f(1)
        // f(3) = 3 + f(2)
        return n + sum(n-1);
        
	}// sum

}// class
