package day3.FunctionEX;
// 1 부터 n까지 수 중 짝수인 것만 출력
public class FunctionSolve10 {
    public static void main(String[] args) {

        printEven(10); // 출력: 2 4 6 8 10
        System.out.println("\n===============================");
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        System.out.println("\n===============================");
        printEven(5); // 출력: 2 4
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;    // 짝수 인지 아닌지 판별
    }
    public static void printEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (isEven(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
