package If_Else;
// 두수 num1과 num2가 주어집니다.
// 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.
public class exam2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int result;

        if(num1 > num2){
            result = num1 - num2;
            System.out.println(result);
        }else if (num1 < num2){
            result = num2 - num1;
            System.out.println(result);
        }
    }
}
