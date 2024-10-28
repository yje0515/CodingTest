class Solution {
    public int solution(int[] common) {
        // 공차 계산
        int diff = common[1] - common[0];
        
        // 등차수열 확인
        if (common[2] - common[1] == diff) {
            return common[common.length - 1] + diff; // 다음 항
        }

        // 등비수열 확인
        int ratio = common[1] / common[0];
        return common[common.length - 1] * ratio; // 다음 항
    }
}
