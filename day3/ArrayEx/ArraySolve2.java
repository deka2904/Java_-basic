package day3.ArrayEx;
// 배열을 두번 출력해주세요.
public class ArraySolve2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < 2 ; i++) {
            for(int j : arr){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
