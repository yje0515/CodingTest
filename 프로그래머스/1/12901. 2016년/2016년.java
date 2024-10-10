class Solution {
    public String solution(int a, int b) {
        //월별 일자수
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        //2016.01.01 FRI
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int days = 0;
        for(int i=0; i<a-1;i++){
            days += month[i];
        }
        //첫날빼기
        days += b-1;
        int dayOfWeek = days%7;
        
        return week[dayOfWeek];
    }
}