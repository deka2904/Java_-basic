package day5.reference.referenceEX;
// 문제 : 레퍼런스변수에 값 할당과정 설명

// 자동차 설계도!, 절대 자동차가 아니다.!!!
class Car {
    // 이 메서드(함수)의 2가지 용도
    // - 설계도를 만들기 위한 과정
    // - 객체들의 묶음
    void Run() {
        System.out.println("자동차가 달립니다.");
    }
}
public class ReferenceSolve2 {
    public static void main(String[] args) {
        // 설명
        Car car;

        // 설명
        car = new Car();

        // 설명
        car.Run();

        // 모든 객체들은 서로를 평생 볼 수 없다.
        // 모든 객체들은 서로를 원격조종한다.
    }
}
