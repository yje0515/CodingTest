class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length();i++){
            String str = Character.toString(my_string.charAt(i));
            if(!answer.contains(str)){
                answer+=str;
            }
        }
        return answer;
    }
}