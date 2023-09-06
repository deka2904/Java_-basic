package day6.constructor;
class Person{
    int age;        // 초깃값 0
    String name;    // 초깃값 null

    Car myCar;      // 초깃값 null

    // 생성자
    // 리턴타입 x, 메소드명은 클래스명과 동일
    public Person(int age, String name, Car myCar){
        this.age = age;
        this.name = name;
        this.myCar = myCar;
    }

    public void init(int age, String name, Car myCar){
        this.age = age;
        this.name = name;
        this.myCar = myCar;
    }

    public void introduce(){
        System.out.printf("안녕하세요. 저는 %d살 %s입니다.\n", age, name);
    }
    public void drive(){
        myCar.use();
    }
}
class Car{
    public void use(){
        System.out.println("자동차를 타고 나갑니다.");
    }
}
public class Constructor {
    public static void main(String[] args) {
//        Person p1 = new Person();
//
//        // 올바른 데이터 세팅 <-- 반드시 필요...
//        // 객체 초기화(initialize)
//
//        // 초기화 조금 더 편하게 개선. -> 메서드 활용..
//        Car car = new Car();
//        p1.init(20, "홍길동", car);
//
//        // 객체의 함수는 데이터를 이용해서 기능을 수행.
//        // 데이터가 있어야 함수가 올바르게 작동한다.
//        p1.introduce();
//        p1.drive();
//
//        Person p2 = new Person();
//        p2.init(30, "이순신", car);
//        p2.introduce();
//        p2.drive();
//
//        // 객체를 만들면 묻지도 따지지도 않고 그냥 실해해버리는 메서드?? -> 생성자.
//        Person p3 = new Person();

    }
}
