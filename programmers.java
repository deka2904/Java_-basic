import java.util.Arrays;
//문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int index = 0;
        String num = my_string.replaceAll("[^0-9]", "");
        System.out.println(num);
//        int num1;
//        num1 = Integer.valueOf(num);
//        System.out.println(num1);
        for (int i = 0; i < num.length() ; i++) {
            answer[index] = num.charAt(i);
            index++;
            System.out.println(answer[index]);
        }
        return answer;
    }
}
public class programmers {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = new int[]{1, 2, -3, 4, -5};
        solution.solution("hi12392");
    }
}
