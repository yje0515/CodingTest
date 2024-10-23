class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string.substring(0,s));
        
        StringBuilder reversed = new StringBuilder(my_string.substring(s,e+1));
        answer.append(reversed.reverse());
        
        answer.append(my_string.substring(e+1,my_string.length()));
        
        return answer.toString();
    }
}