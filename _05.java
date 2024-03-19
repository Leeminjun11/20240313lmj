package chap01;

public class _05 { public static void main(String[] args) {
    char c = 'g';

    int gap = (int)'a' - (int)'A';
    
    char upperCaseC = (char)(c - gap);

    System.out.println("원본 소문자: " + c);
    System.out.println("변환된 대문자: " + upperCaseC);
}
}

