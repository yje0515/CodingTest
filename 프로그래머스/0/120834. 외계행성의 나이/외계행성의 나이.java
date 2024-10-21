class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String ageStr = String.valueOf(age);
        for(int i=0; i<ageStr.length();i++){
            //아스키코드 -> 정수 -> 소문자알파벳순서대로
            char str = (char)('a'+(ageStr.charAt(i)-'0'));
            answer.append(str);
        }
        return answer.toString();
    }
}