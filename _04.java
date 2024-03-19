package chap01;

public class _04 {public static void main(String[] args) {
    
    int totalSeconds = 4000; 
    
    int hours = totalSeconds / 3600;  
    int minutes = (totalSeconds % 3600) / 60; 
    int seconds = totalSeconds % 60; 
    
    System.out.println("변환 결과: " + hours + "시간 " + minutes + "분 " + seconds + "초");
}
}
