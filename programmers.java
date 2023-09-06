public class programmers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("    programmers  ");
    }
}
class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}