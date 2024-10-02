class Solution {
    public String solution(int n) {
        String answer = "";
        if(n%2==0){//짝수
            for(int i=0;i<n/2;i++){
                answer+="수박";
            }
        }else{//홀수
            for(int i=0;i<n/2;i++){
                answer+="수박";
            }
            answer+="수";
        }
        return answer;
    }
}