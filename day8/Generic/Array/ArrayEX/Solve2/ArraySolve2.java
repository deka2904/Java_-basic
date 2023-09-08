package day8.Generic.Array.ArrayEX.Solve2;

import java.util.ArrayList;

class Person {
    private int age;
    private String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}
public class ArraySolve2 {
    public static void main(String[] args) {
        ArrayList <Person> arrayList = new ArrayList<>();

        // 1. 네 사람을 ArrayList에 저장
        System.out.println("========1. 네 사람을 ArrayList에 저장========");
        arrayList.add(new Person(24,"홍길동"));
        arrayList.add(new Person(30,"이순신"));
        arrayList.add(new Person(41,"을지문덕"));
        arrayList.add(new Person(32,"황진이"));
        System.out.println("추가완료");

        // 2. 네 사람에게 자기소개 시키기
        System.out.println("========2. 네 사람에게 자기소개 시키기========");
        for (int i = 0; i < arrayList.size() ; i++) {
            arrayList.get(i).introduce();
        }
        // 3. 30대인 사람에게만 자기소개 시키기
        System.out.println("========3. 30대인 사람에게만 자기소개 시키기========");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getAge() < 40 && arrayList.get(i).getAge() >= 30) {
                arrayList.get(i).introduce();
            }
        }
    }
}
