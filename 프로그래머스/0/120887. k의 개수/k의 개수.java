class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int index=i;index<=j;index++){
            int tmp = index;
            while(tmp!=0){
                if(tmp%10==k){
                    answer++;
                }
                tmp/=10;
            }
        }
        return answer;
    }
}