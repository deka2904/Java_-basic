package day2.DoubleLoop;

public class DoubleLoopSolve5 {
    public static void main(String[] args) {
        int y = 3;
        for (int i = 1; i <= y ; i++) {
            for (int j = 3 - i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 -1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 출력
        /*
           *
          ***
         *****
         */

        y = 5;
//        for (int i = 1; i <= y ; i++) {
//            for (int j = 5 - i; j > 0 ; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i * 2 -1 ; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 출력
        /*
             *
            ***
           *****
          *******
         *********
         */

        y = 7;
//        for (int i = 1; i <= y ; i++) {
//            for (int j = 7 - i; j > 0 ; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i * 2 -1 ; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 출력
        /*
               *
              ***
             *****
            *******
           *********
          ***********
         *************
         */
    }
}
