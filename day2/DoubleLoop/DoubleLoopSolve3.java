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
public class DoubleLoopSolve3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

//        for (int i = 1; i <= 7 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//        }
    }
}
