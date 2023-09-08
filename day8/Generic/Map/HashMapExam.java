package day8.Generic.Map;

import java.util.ArrayList;
import java.util.HashMap;

class 사과{
    사과(){

    }
}
public class HashMapExam {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 배열은 같은 자료형만 묶을 수 있다.
        // 데이터 접근은 인덱싱
        list.add("홍길동");
        list.add("20");
        list.add("대전");

        // 어디에 뭐가 있는지 모른다. -> 그래서 클래스 / 객체 사용

        // HashMap -> 데이터를 키바인딩하여 저장
        HashMap map = new HashMap();
        // 저장 -> put(key, value)
        map.put(0, "홍길동");
        map.put("이름", "홍길동");
        map.put(true, "참");
        map.put("나이", 20);
        map.put("사과", new 사과());

        // 조회 -> get(key)
        System.out.println(map.get(0));
        System.out.println(map.get("이름"));
        System.out.println(map.get(true));
        System.out.println(map.get("나이"));
        System.out.println(map.get("사과"));

        //제너릭을 사용한 버전
        HashMap <String, String> hashMap = new HashMap<>();
        hashMap.put("이름", "홍길동");
        hashMap.put("나이", "20");
        hashMap.put("거주지", "대전");

        System.out.println(hashMap.get("이름"));
        System.out.println(hashMap.get("나이"));
        System.out.println(hashMap.get("거주지"));

        HashMap <String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("이름", "홍길동");
        hashMap2.put("나이", 20);
        hashMap2.put("거주지", "대전");

        System.out.println(hashMap2.get("이름"));
        System.out.println(hashMap2.get("나이"));
        System.out.println(hashMap2.get("거주지"));

        String name = (String)hashMap2.get("이름");
        System.out.println(name);
        // 클래스, 객체로 대체 가능
        // 사용하면 편리, 팀섹 속도가 빠르다. 데이터의 구조가 상대적으로 명확

        // 수정 -> put(key, value)
        // put -> 키가 존재하면 수정, 존재하지 않으면 저장
        hashMap2.put("이름", "이순신");
        System.out.println(hashMap2.get("이름"));

        // 삭제 -> remove(key)
        hashMap2.remove("이름");
        System.out.println(hashMap2.get("이름"));     // 없는 키를 달라고 하면 null이 나옴
    }
}
