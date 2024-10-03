class Solution {
    public int solution(int[] numbers) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        int answer = 0;
        for(int n : numbers){
           for(int i=0; i<num.length;i++){
               if(n==num[i]){
                   num[i]=0;
               }
           }
        }
        for(int j=0; j<num.length;j++){
            answer+=num[j];
        }
        return answer;
        
    }
}