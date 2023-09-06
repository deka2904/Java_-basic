package day6.overloading.overloadingEX;
class Person{
    int age;

    // 디폴트 생성자는 자바가 자동으로 만들어 준다.
    // 단, 직접 생성자를 하나라도 만들면 디폴트 생성자는 자동으로 생성되지 않는다.
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Person p1 = new Person();   // 메개변수가 없는 생성자 -> 디폴트 생성자
    }
}
