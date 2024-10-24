class Solution {
    public int[] solution(String s) {
        int count = 0;//변환횟수
        int zeroCount = 0;//제거된 0의 갯수
        while(!s.equals("1")){
            int originalLength = s.length();
            s = s.replace("0","");
            int newLength = s.length();
            zeroCount += originalLength-newLength;
            //문자의 길이를 2진법으로 표현한 문자열로 교체
            s = Integer.toBinaryString(newLength);
            count++;
        }
        return new int[]{count,zeroCount};
        
    }
}