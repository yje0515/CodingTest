class Solution {
    public int solution(int[] numbers, int k) {
        // k%numbers.length  k번째로 공을 던지는 사람의 번호
        return numbers[(2*k-2)%numbers.length];
    }
}