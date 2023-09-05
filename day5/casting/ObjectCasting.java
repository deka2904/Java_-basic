package day5.casting;

import java.util.Date;

class Animal{
    public void move(){
        System.out.println("움직인다.");
    }
    public void breathe(){
        System.out.println("숨쉬다.");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    public void meow(){
        System.out.println("야옹");
    }
}
public class ObjectCasting {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.bark();
        c1.meow();

        Animal a1 = new Animal();
        Cat c2 = new Cat();

        // a1 = c2;    // Cat이 Animal 변수 대입(X)  Cat이 Animal로 모습을 바꿨다.
        a1 = c2;       // 하휘(자식)클래스가 상위(부모) 클래스로 모습을 바꾸는 건 안전
        a1.move();      // 움직인다.
        a1.breathe();   // 숨쉬다.

        c2.move();      // 움직인다.

        // 반대로
        c2 = (Cat) a1;    // 자동형변환 X, 수동형변환은 가능
        c2.meow();
        c2.move();
        c2.breathe();

        // 객체는 자식 > 부모 형변환 안전.
        // 부모 > 자식은 위험. 수동형변환
        // 상속관계 없으면 형변환 X
    }
}
