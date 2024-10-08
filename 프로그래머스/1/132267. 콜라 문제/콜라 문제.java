class Solution {
    public int solution(int a, int b, int n) {
        int totalBottles = n;
        int returnBottles = 0;
        while(totalBottles>=a){
            //교환한 횟수
            int exchanged = totalBottles/a;
            //교환하고 남은 병
            int remainder = totalBottles%a;
            //교환된 병
            returnBottles += exchanged*b;
            //현재 있는 병
            totalBottles = exchanged*b+remainder;
        }
        return returnBottles;
    }
}