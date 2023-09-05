package day5.inheritance.inheritanceEX.Solve2;
/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D1 완료 : 클래스와 메서드를 만들어서 처리
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
*/
class 오리 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.!!!");
    }
}
class 청둥오리 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.!!!");
    }
}
class 흰오리 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.!!!");
    }
}

public class InheritanceSolve2 {
    public static void main(String[] args) {

        오리 a오리 = new 오리();
        a오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.
    }
}