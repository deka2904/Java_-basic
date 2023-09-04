package day4.ClassEx.Solve1;

// 문제 : 자동차가 3번 달리게 해주세요.
// 출력 : 자동차가 달립니다.
class Car1{
    public void CarRun(){
        System.out.println("자동차가 달립니다.");
    }
}
class Car2{
    public void CarRun(){
        System.out.println("자동차가 달립니다.");
    }
}
class Car3{
    public void CarRun(){
        System.out.println("자동차가 달립니다.");
    }
}
public class ClassSolve1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        Car2 car2 = new Car2();
        Car3 car3 = new Car3();

        //v1. 1개의 자동차가 3번 달리게 해주세요.
        for (int i = 0; i < 3; i++) {
            car1.CarRun();
        }

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        car1.CarRun();
        car2.CarRun();
        car3.CarRun();
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
    }
}
