public class programmers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("aaa");
    }
}
class Solution {
    public String solution(String myString) {
        String answer = "";
        answer = myString.toLowerCase();
        System.out.println(answer);
        return answer;
    }
}