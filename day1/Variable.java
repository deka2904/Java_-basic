package day1;

public class Variable {
    public static void main(String[] args) {
        // 홍길동의 나이를 저장했다가 필요할 때 사용
        
        // 값을 저장하는 상자(그릇) - 변수
        // 변수를 만들 때는 크기와 모양 결정

        // 값 -> 숫자(int), 문자(String)

        // 자료형(타입) 변수명;
        // = 기준 -> 오른쪽 값을 왼쪽 변수에 저장

        // 변수 사용시 주의할 점
        // 1.같은 이름으로 두개이상 변수 만들지 않기
        // 2. 숫자로 시작하거나 특수문자가 포함된 이름은 안됨. 공백도 안됨.

        int age = 25;
        String name = "홍길동";

        // 변수 사용
        System.out.println(25);
        System.out.println(age);

        // 홍길동의 나이를 한번만 사용해서 자기소개 5번 출력
        // 홍길동의 나이를 26으로 수정해보세요.
        age = 26;
        for (int i = 0; i < 5; i++){
            System.out.println("안녕하세요 저는 " + age + "살 "+  name + "입니다.");
        }

        // 변수 사용법2
        // 변수 재활용 가능 (단, 하나의 값만 저장 가능)
        int num = 10;   // int를 저장하는 num이라는 이름의 변수

        System.out.println(num);
        num = 20;
        System.out.println(num);
        num = 30;
        System.out.println(num);


        // 변수의 값을 다른 변수에 대입 가능
        int num2 = 50;

        System.out.println(num2);
        num2 = num;
        System.out.println(num2);


        // 문제

    }
}
