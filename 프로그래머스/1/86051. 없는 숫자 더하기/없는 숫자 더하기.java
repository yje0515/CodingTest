import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        answer-=Arrays.stream(numbers).sum();
        return answer;
    }
}