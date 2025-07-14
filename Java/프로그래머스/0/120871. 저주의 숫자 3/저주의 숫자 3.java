class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;

        while (count < n) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                continue; // 3을 싫어하니까 카운팅 하지 않고 answer++;
            }
            count++;
        }

        return answer;
    }
}
