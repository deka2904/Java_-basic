package day2.DoubleLoop;
// 출력
    /*

    높이 : [3]

      *
     **
    ***

    */

    /*

    높이 : [5]

        *
       **
      ***
     ****
    *****

    */

    /*

    높이 : [7]

          *
         **
        ***
       ****
      *****
     ******
    *******

    */
public class DoubleLoopSolve4 {
    public static void main(String[] args) {
//        for (int i = 0; i < 3 ; i++) {
//            for (int j = 3; j >= 0 ; j--) {
//                if(i<j){
//                    System.out.printf(" ");
//                }else {
//                    System.out.printf("*");
//                }
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 5 ; i++) {
//            for (int j = 5; j >= 0 ; j--) {
//                if(i<j){
//                    System.out.printf(" ");
//                }else {
//                    System.out.printf("*");
//                }
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 7 ; i++) {
            for (int j = 7; j >= 0 ; j--) {
                if(i<j){
                    System.out.printf(" ");
                }else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
