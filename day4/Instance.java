package day4;

import javax.swing.*;

class Person{
    String Name;
    int Age;
    String Home;

    public void introduce(){
        System.out.println("안녕하세요." + Home + "사는 " + Name + "입니다.\n나이는 " + Age + "살입니다.");
    }
}
class Cat{
    int age;
    String kind;
    String name;
    String color;

    public void meow(){
        System.out.println(color + "고양이가 야옹하고 웁니다.");
    }
}
class Computer{
    double cpu;
    int ram;
    int ssd;

    public void poweron(){
        System.out.println("컴퓨터 전원이 켜집니다.");
    }
    public void poweroff(){
        System.out.println("컴퓨터 전원이 꺼집니다.");
    }
}
public class Instance {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.Name = "홍길동";
        p1.Age = 25;
        p1.Home = "대전";

        p1.introduce();

        Person p2 = new Person();
        p2.Name = "이순신";
        p2.Age = 20;
        p2.Home = "서울";

        p2.introduce();

        Cat cat = new Cat();
        cat.color = "blue";
        cat.meow();

        Computer computer = new Computer();
        computer.poweron();
        computer.poweroff();
    }
}