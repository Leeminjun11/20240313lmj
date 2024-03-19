package chap01;

public class _01 {public static void main(String[] args) {
    int rows = 8; // 피라미드의 높이를 설정

    for (int i = 0; i < rows; i++) { // 각 줄마다
        for (int j = 0; j < rows - i - 1; j++) { // 공백 출력
            System.out.print(" ");
        }
        for (int k = 0; k < (2 * i + 1); k++) { // 별 출력
            System.out.print("*");
        }
        System.out.println(); // 줄바꿈
    }
}

}
