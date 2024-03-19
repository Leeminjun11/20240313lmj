package chap01;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print();
        double radius = scanner.nextDouble();
        
        System.out.print();
        double height = scanner.nextDouble();
        
        double volume = Math.PI * radius * radius * height;
        
        System.out.println("원기둥의 부피는 " + volume + "입니다.");
        
        scanner.close();
    }
}
