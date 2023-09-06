package day6.overloading.overloadingEX.Solve3;

class 사람{
    String name;
    public 사람(){}
    public 사람(String name){
        this.name = name;
        System.out.printf("%s", this.name);
    }
}
class 사과 {
    // 이렇게 생성자를 만들지 않은 클래스는 자바에서 자동으로 생성자를 하나 만들어준다.
    // 참고로 자동으로 만들어 질 때 `매개변수 없는 생성자`가 만들어집니다.
}

class 포도 {
    포도() {
        // 이렇게 생성자를 직접 만들면 자바는 더 이상 자동으로 생성자를 만들어주지 않습니다.
    }
}
public class OverloadingSolve3 {
    public static void main(String[] args) {
        new 사과();
        new 포도();
        new 사람("홍길동");
        new 사람();
    }
}
