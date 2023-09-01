package day3;

public class FunctionReturn {
    public static double circleArea(int radius){
        double result;

        result = radius * radius * 3.14;    // 원의 넓이 -> result에 담아 놓음
        return result;
    }

    public static void main(String[] args) {
        // 1. 반지름으로 원의 넓이를 구하는 함수 만들기
        // 반지름 * 반지름 * 3.14

        // 2. 반지름이 5인 원의 넓이를 구해서 출력
        double  result = circleArea(5);
        System.out.println(result);

        // 3. 반지름이 5인 원의 넓이를 2로 나눈 값
        result /= 2;
        System.out.println(result);

        // 4. 반지름의 5인 원의 넓이를 2로 곱한 값
        result *= 2;
        System.out.println(result);
    }
}
