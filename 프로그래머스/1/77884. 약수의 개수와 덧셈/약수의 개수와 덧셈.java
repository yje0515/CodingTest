class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right;i++){
            //약수의 갯수 초기화
            int count = 0;
            for(int j=1;j<=right;j++){
                if(i%j==0){
                    count++;
                }
            }
            //짝수
            if(count%2==0){
                answer+=i;
            }else{//홀수
                answer-=i;
            }
        }
        return answer;
    }
}