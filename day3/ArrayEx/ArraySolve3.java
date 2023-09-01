package day3.ArrayEx;

public class ArraySolve3 {
    public static void main(String[] args) {
        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] reArr = new int[5];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
                reArr[j] = arr[i];
        }

        for (int k : reArr) {
            System.out.print(k + " ");
        }

    }
}
