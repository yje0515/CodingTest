class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isStr = true;
        for(char c : s.toCharArray()){
            if(isStr){
                answer.append(Character.toUpperCase(c));
            }else{
                answer.append(Character.toLowerCase(c));
            }
            if(c == ' '){
                isStr = true;
            }else{
                isStr = false;
            }
        }
        return answer.toString();
        
    }
}