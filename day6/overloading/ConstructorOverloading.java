package day6.overloading;

import java.security.PublicKey;

class Person{
    int age;
    String name;
    
    // 오버로딩 
    // 함수명이 같을때 매개변수와 매개변수 타입이 다를때 사용 가능
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Person(){

    }
    public Person(int age){
        this.age = age;
    }
    public void introduce(){
        System.out.printf("%d살 %s입니다.\n", this.age, this.name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // 이름과 나이를 모두 알때
        Person p1 = new Person(20, "홍길동");
        p1.introduce();

        // 이름과 나이를 모를때
        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";
        p2.introduce();

        // 나이만 알때
        Person p3 = new Person(50);
        p3.name = "홍길순";
        p3.introduce();
    }
}
