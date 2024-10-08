class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=0;i<food.length;i++){
            int tmp = food[i]/2;
            while(tmp>0){
                answer += Integer.toString(i);
                tmp--;
            }
        }
        answer += "0";
        for(int i=food.length-1;i>=0;i--){
            int tmp = food[i]/2;
            while(tmp>0){
                answer += Integer.toString(i);
                tmp--;
            }
        }
        return answer;
    }
}