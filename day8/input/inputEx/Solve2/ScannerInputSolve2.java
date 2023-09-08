package day8.input.inputEx.Solve2;

import java.util.Scanner;

public class ScannerInputSolve2 {
    public static void main(String[] args) {

        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.
        Scanner scanner = new Scanner(System.in);
        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)
        System.out.print("원하는 단을 입력해주세요 : ");
        int num = scanner.nextInt();
        // 4단 출력.
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }

    }
}
