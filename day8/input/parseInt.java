package day8.input;

import java.util.Scanner;

public class parseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력해주세요 : ");
        String num = scanner.nextLine();

        // 문자를 -> 숫자로 변환
        // 관련 없는 타입끼리는 형변환 X

        // Integer 래퍼클래스 사용
        int age = Integer.parseInt(num);

        System.out.print("이름을 입력해주세요 : ");
        String name = scanner.nextLine();

        System.out.printf("%s살, %s입니다.", age, name);

    }
}
