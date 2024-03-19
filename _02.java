package chap01;

import java.util.Scanner;

public class _02 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("정수를 입력하세요: ");
	        int number = scanner.nextInt();

	        int square = number * number;

	        System.out.println("입력하신 정수의 제곱값은 " + square + "입니다.");

	        scanner.close();
	    }
	}
