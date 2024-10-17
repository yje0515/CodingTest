class Solution {
    public int solution(int n) {
        //n<=10!
        int fac = 1;
        int answer = -1;
        for(int i=1; i<=10; i++){
            fac *=i;
            if(fac==n){
                answer = i;
                break;
            }
            if(fac>n){
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}