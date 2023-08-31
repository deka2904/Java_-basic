package day2;

public class LoopEX {
    public static void main(String[] args) {
        // 2중 반복문
        // 1. 1~5까지 10번 출력
        for (int i = 1; i <= 10; i++) {
            System.out.printf("===%d회차===\n", i);
            for (int j = 1; j < 6; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }

        System.out.println("=======================================================");

        // 2. 직사각형 만들기
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 50 ; b++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
