package day4.Class.ClassEx.Solve2;
// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.
class Car{
    int Km = 220;

    public void KmPrint(){
        System.out.println("자동차가 최대속력 " + Km +"km로 달립니다.");
    }
}
class Car1{
    int Km = 250;

    public void KmPrint(){
        System.out.println("자동차가 최대속력 " + Km +"km로 달립니다.");
    }
}

public class ClassSolve2 {
    public static void main(String[] args) {

        // 출력 : 자동차가 최대속력 220km로 달립니다.
        Car car1 = new Car();
        car1.KmPrint();
        // 출력 : 자동차가 최대속력 250km로 달립니다.
        Car1 car2 = new Car1();
        car2.KmPrint();
    }
}
