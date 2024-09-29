class Solution {
    public int solution(int n) {
        //7조각으로 나눴을 때 n명이 한조각 이상 먹기 위해 필요한 피자의 수
        //피자*슬라이스>=인원수
        return (n+6)/7;
    }
}