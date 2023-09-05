package day5.reference;
class Person {
    int age;
    String name;

    public void introduce(){
        System.out.println("안녕");
    }
}
public class Reference2 {
    public static void main(String[] args) {
        Person p1;  // 사람이 한명 있다(X)
        // p1은 null이다.

        p1 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p1에 저장
        Person p2 = new Person();

        p1.age = 20;
        p1.name = "홍길동";

        p2.age = 30;
        p2.name = "이순신";

        p1.introduce();
        p2.introduce();

        // num1, num2는 원본이고, p1, p2는 참조(reference)다.
        int num1 = 10;
        int num2 = num1;

        p1 = p2;    // p2가 p1에 복사가 된다.
        p1.name = "임꺽정";
        System.out.println(p1.name);    // 임꺽정
        System.out.println(p2.name);    // 임꺽정
    }
}
