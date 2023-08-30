package day1;

public class Main {
    public static void main(String[] args) {
        // 숫자 출력
        System.out.println(100);

        // 문자 출력
        System.out.println("100");
        System.out.println("Hello world!");

        // 문자, 숫자 처럼 값의 유형이 다르면 기능도 다르다.
        // "" 문자형
        // 100 숫자형
        // 자료형이라고 부른다.

        // 숫자 -> int
        // 문자 -> String

        // 문자의 경우 \n을 넣으면 줄이 바뀐다.
        System.out.println("안녕하세요\n반갑습니다.");

        // 문자와 숫자를 더하기
        System.out.println(100 + "살" + "홍길동입니다.");

        // 문자 포맷을 이용한 출력g
        // %d -> 숫자값이 들어간다.
        System.out.printf("%d살 홍길동입니다.\n", 25);
        System.out.printf("%d년생 %d살 홍길동 입니다.\n", 1999, 25);

        // 안녕하세요 저는 23살 홍길동입니다. 5번
        for (int i = 0; i < 5; i++){
            System.out.println("안녕하세요 저는 23살 홍길동입니다.");
        }
        // aaaa
    }
}