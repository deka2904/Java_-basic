package day6.overloading;
class 오리 {
    String fly;
    String foot;
    public void 날다(String fly) {
        this.fly = fly;
        System.out.printf("오리가 %s로 날아갑니다.\n", this.fly);
    }
    public void 헤엄치다(String foot) {
        this.foot = foot;
        System.out.printf("오리가 오리%s로 헤엄칩니다.\n", this.foot);
    }
}
class 청둥오리 extends 오리 {

}

class 흰오리 extends 오리 {

}

class 고무오리 extends 오리 {
    String fly;
    String foot;
    // 메서드 재정의(오버라이딩)
    public void 날다(String fly) {
        this.fly = fly;
        System.out.println("저는 날 수 없어요.. ㅠ");
    }

    public void 헤엄치다(String foot) {
        this.foot = foot;
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}

class 고무2오리 extends 고무오리 {

}

class 아수라오리 extends 고무오리 {
    public void 날다(String fly) {
        this.fly = fly;
        System.out.printf("오리가 %s로 날아갑니다.\n", this.fly);
    }
}
public class exam {
    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다("날개");
        a청둥오리.헤엄치다("발");
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다("날개");
        a흰오리.헤엄치다("발");
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다("날개");
        a고무오리.헤엄치다("발");
        //출력 : 오리가 날개로 날아갑니다.


        // 상속만으로 코드 중복을 완전히 해소할 수 없었다.
        // 코드 중복을 해소하기 위해서 상속을 사용하는 건 본질 X
        // 계층 구조를 표현 가능

        아수라오리 a아수라오리 = new 아수라오리();
        a아수라오리.날다("날개");
        a아수라오리.헤엄치다("발");
    }
}