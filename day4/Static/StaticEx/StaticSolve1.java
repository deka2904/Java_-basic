package day4.Static.StaticEx;
// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.

class 자동차{
    public static void 달리다(){
        System.out.println("달리다.");
    }
}
public class StaticSolve1 {
    public static void main(String[] args) {
        자동차 자동차 = new 자동차();
        자동차.달리다();
    }
}