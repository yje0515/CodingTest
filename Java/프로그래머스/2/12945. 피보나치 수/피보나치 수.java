class Solution {
    public int solution(int n) {
        int answer = 0;
        int num1 = 0;
        int num2 = 1;
        for(int i=1;i<n;i++){ 
            answer = (num1+num2)%1234567; //0+1   1+1  1+2   2+3   3+5
            num1 = num2;      //1     1    2     3     5
            num2 = answer;      //0+1   2    3     5     8
        }
        return answer;
    }
}