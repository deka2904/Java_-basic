package day8.input;

import java.util.Scanner;

public class ScannerInputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 한단어를 읽어오는 방법
        String str = scanner.next();
        System.out.printf("단어 : %s" , str);

        String garbage = scanner.nextLine();
        System.out.println();
        // 공백을 포함한 한 문장을 가져오는 방법
        String str2 = scanner.nextLine();
        System.out.printf("문장 : %s", str2);

        scanner.close();
    }
}
