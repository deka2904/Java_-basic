import javax.management.remote.TargetedNotification;
import java.util.Arrays;

public class programmers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{49, 12, 100, 276, 33};
        solution.solution(arr, 27);
    }
}
class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        if (arr.length % 2 == 1){
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0){
                    arr[i] += n;
                    answer[i] = arr[i];
                    System.out.println(answer[i]);
                    continue;
                }
                answer[i] = arr[i];
                System.out.println(answer[i]);
            }
        }else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 1){
                    arr[i] += n;
                    answer[i] = arr[i];
                    System.out.println(answer[i]);
                    continue;
                }
                answer[i] = arr[i];
                System.out.println(answer[i]);
            }
        }
        return answer;
    }
}