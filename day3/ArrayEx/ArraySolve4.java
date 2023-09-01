package day3.ArrayEx;
// 배열 안의 숫자들의 합을 구해주세요.
public class ArraySolve4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i : arr){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("합 : " + sum);
    }
}
