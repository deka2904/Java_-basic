package day5.reference.referenceEX;
// 문제 : 레퍼런스변수에 값 할당과정 설명

// 과정설명
// ...

// class => 설계도, 틀(객체를 만들기 위한)
class Car1 {
    // 달리다 함수/메서드
    void run() {
        System.out.println("자동차가 달립니다.");
    }
}
public class ReferenceSolve3 {
    // 메인 함수
    public static void main(String[] args) {
        // 설명
        Car1 car1;

        // 설명
        car1 = new Car1();

        // 설명
        car1.run();
    }
}
