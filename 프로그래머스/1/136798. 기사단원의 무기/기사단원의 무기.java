class Solution {
    public int solution(int number, int limit, int power) {
        int[] weapon = new int[number + 1];
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            for(int j = i; j <= number; j += i) { // j는 i의 배수
                weapon[j]++;
            }
        }
        for(int i = 1; i <= number; i++) {
            answer+= (weapon[i] > limit)?power:weapon[i];
        }
        return answer;
    }
}
