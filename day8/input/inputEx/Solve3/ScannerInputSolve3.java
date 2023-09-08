package day8.input.inputEx.Solve3;

import java.util.Scanner;
// 이름과 나이를 입력값으로 받아 자기소개를 해주세요.

public class ScannerInputSolve3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        String name = scanner.nextLine();
        System.out.print("나이를 입력해주세요 : ");
        int age = scanner.nextInt();

        System.out.printf("안녕하세요. %d세 %s입니다.\n", age, name);
        // 이름을 입력해주세요 : 홍길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍길동입니다.

    }
}
