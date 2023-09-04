package day4.Static;
class Person{
    // 인류 평균 나이는 모든 사람이 동일하게 공유해야 하는 값
    // 객체들이 공유해야 하는 자원에는 static을 붙인다.
    static int avgAge;
    int age;
    String name;

    public void getLife() {
        System.out.println("당신의 남은 수명은 약 " + (avgAge - age) + "살 입니다.");
    }
}
public class Static {
    public static void main(String[] args) {
        Person p1 = new Person(); // 객체 복사본
        Person p2 = new Person();

        Person.avgAge = 73;

        p1.name = "이순신";
        p1.age = 40;
        p1.getLife();

        p2.name = "홍길동";
        p2.age = 30;
        p2.getLife();
    }
}
