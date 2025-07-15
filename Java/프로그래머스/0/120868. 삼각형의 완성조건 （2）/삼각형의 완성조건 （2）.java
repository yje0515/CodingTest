class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        
        // 두 경우의 범위 계산
        int minRange = Math.abs(a - b) + 1;
        int maxRange = a + b - 1;
        
        // 가능한 정수 개수는 maxRange - minRange + 1
        return maxRange - minRange + 1;
    }
}
