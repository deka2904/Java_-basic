package day6.overloading;
class Caculator{
    // 메서드 오버로딩 -> 같은 이름으로 메서드를 여러개 만드는 것(조건, 매개변수의 생김새가 달라야 한다.)
    public int plus(int num1, int num2){
        return num1 + num2;
    }
    public int plus(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public double plus(double num1, double num2){
        return num1 + num2;
    }
}
public class OverLoading {
    public static void main(String[] args) {
        Caculator c1 = new Caculator();

        int result1, result2;
        double result3;
        result1 = c1.plus(1,2);
        result2 = c1.plus(1,2,3);
        result3 = c1.plus(5.0,10.0);
        System.out.println(result1 + " " + result2 + " " + result3);
    }
}
