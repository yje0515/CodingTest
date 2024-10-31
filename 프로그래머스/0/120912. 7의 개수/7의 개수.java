class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            int tmp = a;
            while(tmp>0){
                if(tmp%10==7){
                    answer++;
                }
                tmp/=10;
            }
        }
        return answer;
    }
}