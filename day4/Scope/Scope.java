package day4.Scope;
class Person{
    static int avgAge = 100; // 클래스 변수
    int age = 30; // 인스턴스

    public static void hi() {
        System.out.println("하이");
    }
}
public class Scope {
    public static void main(String[] args) {
        System.out.println(Person.avgAge);
        // System.out.println(Person.age);     // 객체를 만즐지 않았기 때문...  사용x

        Person p1 = new Person();
        System.out.println(p1.age);

        Person.hi();
    }
}
