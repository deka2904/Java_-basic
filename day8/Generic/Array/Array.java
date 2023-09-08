package day8.Generic.Array;

import java.util.ArrayList;
import java.util.Arrays;

class 저장소<T>{
    private Object[] datas;
    int index;
    저장소(){
        datas = new Object[3];
        index = 0;
    }
    public void setData(T data){
        this.datas[index] = data;
        index++;
    }
    public T getData(int idx){
        return (T)datas[idx];
    }
}
public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("================");
        // 몇개 저장했는지 알기 힘듦
        Integer[] arr2 = new Integer[10];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;

        // length는 배열의 전체 길이를 나타냄
        System.out.println(arr2.length);

        // 저장소가 꽉 차면 알아서 늘어나고
        // 추가, 삭제도 되고,
        // 내가 몇개 저장했는지 세주기도 하고
        // 그런 애가 있으면 좋겠네

        // 자바가 제공하는 저장소 클래스 -> ArrayList
        ArrayList <Integer> a저장소 = new ArrayList<>();
        // 추가
        System.out.println("======추가======");
        a저장소.add(10);
        a저장소.add(20);
        a저장소.add(30);

        // 조회
        System.out.println("======조회======");
        int num = a저장소.get(1);
        System.out.println(num);
        num = a저장소.get(0);
        System.out.println(num);

        // 수정
        System.out.println("======수정======");
        a저장소.set(1,10);
        num = a저장소.get(1);
        System.out.println(num);

        // 삭제
        System.out.println("======삭제======");
        a저장소.remove(1);
        num = a저장소.get(1);
        System.out.println(num);

        // 사이즈
        System.out.println("======사이즈======");
        int size = a저장소.size();
        System.out.println(size);

//        a저장소.setData(10);
//        a저장소.setData(20);
//        a저장소.setData(30);
//
//        int num = a저장소.getData(1);
//        System.out.println(num);
//        num = a저장소.getData(0);
//        System.out.println(num);
    }
}
