package day7.DataType;

public class DataType {
    public static void main(String[] args) {
        /*
        자료형
        원시타입, 객체타입
        숫자형, 객체형

        << 숫자형 >>
        정수 (byte, short, int, long)
        실수 (double, float)
        논리값 (boolean -> 참 1 거짓 0)
        문자 (char)
        문자열 (String)

        << 객체형 >>
        int[] -> 배열
        String -> 문자열 (배열)
        class로 만드는 모든것

        형변환 -> 안전한 경우 자동형변환
              -> 위험한 경우 수동형변환
              -> 관계 없는 것끼리는 형변환 X
        */

        // 자바는 객체지향언어
        int num = 10;   // 슷자타입은 객체지향의 혜택 X

        // 숫자타입 -> 객체타입 (박싱)
        // 래퍼클래스

        // int의 래퍼클래스
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // new Integer(10);
        // 숫자 -> 객체(박싱)
        Integer iobj = Integer.valueOf(10);
        System.out.println(iobj);

        // 객체 -> 슷자(언박싱)
        int i = iobj.intValue();
        System.out.println(i);

        // 오토박싱, 오토언박싱
        i = iobj; // i는 int, iobj는 Integer ==> 오토언박싱
        System.out.println(i);

        Integer ioj2 = 20;  // 오토박싱
        // 원시타입에 해당하는 자료형에는 몯 래퍼클래스가 존재.
        // int -> Integer, char -> Charactor
        // double -> Double, float -> Float, short -> Short...
        
        String str = "hihi";    // String도 객체타입
    }
}
