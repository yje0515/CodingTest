class Solution {
    public int solution(String s) {
        int strX = 0;
        int notX = 0;
        int answer = 0;
        char x = s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(strX==notX){
                x = s.charAt(i);
                answer++;
            }
            char c = s.charAt(i);
            if(c==x){
                strX++;
            }else{
                notX++;
            }
        }
        return answer;
    }
}