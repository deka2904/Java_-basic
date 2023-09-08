package day8.EXception;

public class ExceptionEx {
    public static void main(String[] args) {
        // 예외처리

        // 컴파일 타임
        // 문법 오류

        // 런타임(프로그램 실행중) -> 런타임 에러
        // 에러 -> 시스템, 네트워크, 머신
        // 예외 -> 프로그래머의 실수
        try {
            System.out.println("hihi");

            int[] arr = new int[3];
            arr[10] = 10;
        } catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("byebye");
        }
    }
}
