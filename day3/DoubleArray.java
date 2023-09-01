package day3;

public class DoubleArray {
    public static void main(String[] args) {
        // 2차원 배열 -> 배열의 배열
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2= {5, 6, 7, 8};
        int[] arr3 = {9, 10, 11, 12};

        int[][] darr = {arr1, arr2, arr3};

        for (int i = 0; i < darr.length ; i++) {
            for (int j = 0; j < darr[i].length ; j++) {
                System.out.print(darr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===============================");

        int[][] darr2 = {
                {11, 12, 13, 14},
                {15, 16, 17, 18},
                {19, 20, 21, 22}
        };
        for (int k = 0; k < darr2.length ; k++) {
            for (int l = 0; l < darr2[k].length ; l++) {
                System.out.print(darr2[k][l] + " ");
            }
            System.out.println();
        }
    }
}
