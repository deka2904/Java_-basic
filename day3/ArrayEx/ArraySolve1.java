package day3.ArrayEx;

public class ArraySolve1 {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        // int[] arr = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; -> 무식한 방법;;;
        int[] arr = new int[10];
        int num = 0;
        for (int i = 0; i < arr.length; i++) { // -> for i - 0   arr.length -> 10
            num += 10;  // num -> 0 + 10 = 10
           arr[i] = num; // num 10 -> arr[0] -> 10  ->>>>> arr[1] 20
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
