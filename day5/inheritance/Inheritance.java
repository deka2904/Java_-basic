package day5.inheritance;

// 부모 클래스
class Animal{
    public void breathe(){
        System.out.println("숨쉬다.");
    }
    public void move(){
        System.out.println("움직이다.");
    }
}

// 자식 클래스
class Dog extends Animal{
    int age;
    String kind;

    public void bark(){
        System.out.println("멍멍");
    }
}

// 자식 클래스
class Cat extends Animal{
    int age;
    String kind;

    public void meow(){
        System.out.println("야옹");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.bark();
        cat.meow();
        
        // 클래스 단위에서 중복이 발생
        // 상속
        // 고양이, 개 -> 포유류, 동물, 생물

        dog.breathe();
        cat.breathe();
        dog.move();
        cat.move();

    }
}
