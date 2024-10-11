class Solution {
    public int solution(int[] numbers, int k) {
        // 1명씩 건너뜀 2*k
        // k번째로 공을 "던지는" 사람의 번호(-2)
        // %numbers.length
        return numbers[(2*k-2)%numbers.length];
    }
}