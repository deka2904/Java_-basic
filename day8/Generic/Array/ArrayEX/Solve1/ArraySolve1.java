package day8.Generic.Array.ArrayEX.Solve1;

import java.util.ArrayList;

// {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
// ArrayList의 사이즈를 출력해주세요.
// ArrayList의 3,4번째 값을 읽어서 출력해주세요.
// 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
// List의 모든 값을 출력해주세요.
public class ArraySolve1 {
    public static void main(String[] args) {

        // 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
        // 리스트에 값을 추가해주세요.
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("======추가======");
        for (int i = 5; i >= 0; i--) {
            arrayList.add(i);
        }

        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        // 출력결과 : 6
        System.out.println("======사이즈======");
        int size = arrayList.size();
        System.out.println(size);

        // get()
        // 리스트의 3,4번째 값을 출력해주세요. {5,4,3,2,1,0}
        // 출력결과 : 3, 2
        System.out.println("======출력======");
        int num = arrayList.get(2);
        System.out.println(num);
        num = arrayList.get(3);
        System.out.println(num);


        // remove()
        // 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        // 출력 결과 : 1, 0    {5,4,3,2,1,0}
        System.out.println("======삭제======");
        arrayList.remove(0);
        arrayList.remove(0);
        num = arrayList.get(2);
        System.out.println(num);
        num = arrayList.get(3);
        System.out.println(num);
//        for (int i = 0; i < arrayList.size() ; i++) {
//            num = arrayList.get(i);
//            System.out.println(num);
//        }

        // 반복문으로 출력.
        //
        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 3, 2, 1, 0
        System.out.println("======출력======");
        for (int i = 0; i < arrayList.size() ; i++) {
            num = arrayList.get(i);
            System.out.println(num);
        }

    }
}
