class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;//초기 쿠폰
        while(coupon>=10){
            int newChicken = coupon/10;//새로 받은 치킨
            coupon = newChicken + (coupon%10);
            answer += newChicken;
        }
        return answer;
    }
}