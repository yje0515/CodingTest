

class Solution {
    public int[] solution(long n) {
        String strNum = Long.toString(n);
        int[] answer = new int[strNum.length()];
        for(int i=0;i<strNum.length();i++){
            answer[i] = strNum.charAt(strNum.length()-1-i)-'0';
        }
        return answer;
    }
}