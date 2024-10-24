class Solution {
    public int solution(int n) {
        //10진수 => 3진수 문자열
        String converted = Integer.toString(n,3);
        //3진수 문자열 뒤집기
        String reversed = new StringBuilder(converted)
            .reverse().toString();
        //3진수 문자열 => 10진수
        return Integer.parseInt(reversed,3);
    }
}