package day4;
// 인스턴스(복사본, 객체)
class Person{
    String Name;
    int Age;
    String Home;

    public void introduce(){
        System.out.println("안녕하세요." + Home + "사는 " + Name + "입니다.\n나이는 " + Age + "살입니다.");
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

        p1.introduce();

    }
}