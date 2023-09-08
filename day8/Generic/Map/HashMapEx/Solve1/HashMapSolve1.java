package day8.Generic.Map.HashMapEx.Solve1;

import java.util.HashMap;

public class HashMapSolve1 {
    public static void main(String[] args) {
        // 사람 정보를 map으로 저장하고 출력하기
        // 사람 1 정보
        // 이름 : 홍길동
        // 나이 : 22
        // 키 : 170.5

        // 사람 2 정보
        // 이름 : 홍길순
        // 나이 : 25
        // 키 : 162.4
        HashMap <String, Object> hashMap = new HashMap<>();

        System.out.println("==========사람 1 정보==========");
        hashMap.put("이름", "홍길동");
        hashMap.put("나이", 22);
        hashMap.put("키", 170.5);

        System.out.println(hashMap.get("이름"));
        System.out.println(hashMap.get("나이"));
        System.out.println(hashMap.get("키"));

        System.out.println("==========사람 2 정보==========");
        hashMap.put("이름", "홍길순");
        hashMap.put("나이", 25);
        hashMap.put("키", 162.4);

        System.out.println(hashMap.get("이름"));
        System.out.println(hashMap.get("나이"));
        System.out.println(hashMap.get("키"));
    }
}
