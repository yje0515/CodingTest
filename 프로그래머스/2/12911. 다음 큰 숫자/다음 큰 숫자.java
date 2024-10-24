class Solution {
    public int solution(int n) {
        int target = Integer.bitCount(n);
        int answer = n;
        while(true){
            answer++;
            if(Integer.bitCount(answer)==target){
                return answer;
            }
        }
    }
}