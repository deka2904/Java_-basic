package day8.EXception.Solve;
import java.util.Scanner;
public class ExceptionSolve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력해주세요 : ");


        while (true) {
            try {
//                int age = Integer.parseInt(scanner.nextLine());
                int age = scanner.nextInt();
                if (age <= 0) {
                    System.out.print("0보다 커야합니다. : ");
                } else {
                    System.out.print("입력된 나이 : " + age);
                    break;  // 올바른 나이가 입력되면 루프 종료
                }
            } catch (Exception e) {
                System.out.print("숫자를 입력해주세요. : ");  // 숫자가 아닌 값을 입력한 경우 예외 처리
            }
        }
    }
}
