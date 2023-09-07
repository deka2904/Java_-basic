package day7.AccessModifier;

class Caculator{
    // 그냥 웬만하면 객체변수는 private
    private int num1 = 10;
    private int num2 = 20;

    public int plus(){
        return num1 + num2;
    }
    public double devide(){
        return (double) num1 / num2;
    }

    // 외부에서 객체 변수에 접근하기 위한 메서드 2개
    // setter -> 변수 값을 세팅
    // getter -> 뱐수 값을 가져감
    // setter, getter 이름 짓는법
    // set + 변수명, get + 변수명, 단 변수명 시작 알파벳은 대문자
    void setNum1 (int num){
        this.num1 = num;
    }
    public void setNum2 (int num){
        if(num == 0){
            System.out.println("0은 안됩니다.");
            return;
        }
        this.num2 = num;
    }

    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
}

public class AccessModifier {
    // 접근지정자
    public static void main(String[] args) {
        // public -> 어디서든 누구나 접근 가능
        // protected -> 같은 패키지(폴더) + 상속관계에서만 가능 
        // private -> 자기 자신만 가능
        // default -> 같은 패키지에서만 가능

        Caculator c1 = new Caculator();
        System.out.println(c1.plus());

//        c1.num1 = 100;
//        c1.num2 = 200;

        System.out.println(c1.plus());
        System.out.println(c1.devide());

        // 숫자를 0으로 나누면 안된다.
        // 객체의 인스턴스 변수를 바꾸는 것은 부담스러운 작업이다.
        // private 접근제어자를 이용해서 겁근을 막는다.
        // c1.num1 = 200;
        // c1.num2 = 0;
        // ↓ (변경)
        c1.setNum1(100);
        c1.setNum2(200);
        System.out.println(c1.devide());

        c1.setNum1(100);
        c1.setNum2(0);
        System.out.println(c1.devide());

        System.out.println(c1.getNum1());
        System.out.println(c1.getNum2());

//        System.out.println(c1.plus2());

//        Caculator2 c2 = new Caculator2();
//        System.out.println(c2.plus());
    }
}
