package day3;

public class function {
    // 함수 정의
    // void - 리턴타입
    // code - 함수명
    // () - 매개변수
    public static void code(){
        System.out.println("code1");
        System.out.println("code2");
        System.out.println("code3");
    }
    public static void plus(int num1, int num2){
        int result = num1 + num2;

        System.out.println(result);
    }
    public static void plus2(int num1, int num2, int num3){
        int result = num1 + num2 + num3;

        System.out.println(result);
    }
    // main함수
    public static void main(String[] args) {
        System.out.println("===함수 시작===");
        // 함수
        // 코드 저장소
        // 입력 -> <처리> -> 출력

        // 1. 함수는 코드 저장소
        // 2. 함수 규칙
        //    - 규칙1. 함수는 클래스 안에서 청의해야 한다.(함수 안에 함수 정의 X)
        //    - 규칙2. return타입, 함수명, 매개변수를 지정한다.
        //    - 규칙3. 같은 이름의 함수를 2개 만들지 않는다.
        //    - 규칙4. 함수는 호출(사용) 해야만 실행이 된다.

        // 함수 -> code1~3 출력
        // 정의된 함수를 호출(사용)
        code();

        // 함수의 확장 -> 매개변수
        plus(10, 20);
        plus(100, 200);
        plus2(100, 200, 300);
        System.out.println("===함수 끝===");
    }
}
