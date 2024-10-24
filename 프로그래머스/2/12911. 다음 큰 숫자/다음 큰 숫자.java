class Solution {
    public int solution(int n) {
        int target = Integer.bitCount(n);//2진수의 1의 갯수를 세는 메서드
        int answer = n;
        while(true){
            answer++;
            if(Integer.bitCount(answer)==target){
                return answer;
            }
        }
    }
}