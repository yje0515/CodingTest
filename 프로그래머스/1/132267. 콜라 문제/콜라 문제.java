class Solution {
    public int solution(int a, int b, int n) {
        int totalBottles = n;
        int returnBottles = 0;
        while(totalBottles>=a){
            //교환한 횟수 = 보유중인 병/a
            int exchanged = totalBottles/a;
            //교환하고 남은 병 = 보유중인 병/a나머지
            int remainder = totalBottles%a;
            //교환된 병 = 교환한 횟수 * b
            returnBottles += exchanged*b;
            //현재 있는 병 = 교환된 병 + 교환하고 남은 병
            totalBottles = exchanged*b+remainder;
        }
        return returnBottles;
    }
}