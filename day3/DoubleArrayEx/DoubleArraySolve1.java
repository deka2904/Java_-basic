package day3.DoubleArrayEx;

public class DoubleArraySolve1 {
    public static void main(String[] args) {
        int[][] darr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        // 1. 다음과 같이 출력되게 해주세요.
        /*
        4 3 2 1
        8 7 6 5
        12 11 10 9
        16 15 14 13
        */

        int[][] rearr = new int[4][4];
        /*        {
        {4,3,2,1},
        {8,7,6,5},
        {12,11,10,9},
        {16,15,14,13}
        }        */
        //         4         4
        for (int i = 0; i < darr.length ; i++) {
            //   j =  darr[0].길이 ->  3       0
            for (int j = darr[i].length - 1, k = 0; j >= 0; j--, k++) {
                //    3  0         3  3
                rearr[i][k] = darr[i][j]; //
                System.out.print(rearr[i][k] + " ");
            }
            System.out.println();
        }

        System.out.println("==================================");

        // 2. 다음과 같이 출력되게 해주세요.
        /*
        16 12 8 4
        15 11 7 3
        14 10 6 2
        13 9 5 1
        */
        int[][] rearr2 = new int[4][4];

        for (int a = 3; a >= 0 ; a--) {
            for (int b = 3, c = 0; b >= 0; b--, c++) {
                rearr2[c][a] = darr[b][a];
                System.out.print(rearr2[c][a] + " ");
            }
            System.out.println();
        }
    }
}
