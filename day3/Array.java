package day3;

public class Array {
    public static void main(String[] args) {
        // 배열(Array)

        // 배열은 하나의 변수로 여러개의 값을 관리
        // 1. 선언과 동시에 저장
        int[] arr = {1, 2, 3, 4, 5};

        // 순서(순번) - index
        System.out.println(arr[2]);
        System.out.println(arr[0]);


        // 2. 선언하고 나중에 저장
        // new 자료형[갯수]
        int[] arr2 = new int[100];  // 0 -> 100개 만들어짐

        // arr3 배열에 5개의 숫자 저장
        /*
        <<무식한 방법;;>>
         arr3[0] = 10;
         arr3[1] = 4000;
         arr3[2] = 1;
         arr3[3] = 99999;
         arr3[4] = 3;

         System.out.println(arr3[0]);
         System.out.println(arr3[1]);
         System.out.println(arr3[2]);
         System.out.println(arr3[3]);
         System.out.println(arr3[4]);
        */
        
        // 반복문 사용하여 출력
        int[] arr3 = new int[]{10, 4000, 1, 99999, 3};
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 배열은 같은 자료형만 저장 가능하다.
        // arr4 = {1, "Hello", true, 1.4};  -> 여러 종류의 타입은 배열에 넣을수 없다.

        String[] arr5 = new String[3];  // null값으로 3개가 채워짐
        arr5[0] = "hello";
        arr5[1] = "bye";
        arr5[2] = "good";

        for (int i = 0; i < arr5.length ; i++) {
            System.out.println(arr5[i]);
        }
    }
}
