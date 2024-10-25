class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        int index = 0; //단어인덱스
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') { //공백
                result.append(c);
                index = 0; //초기화
            } else {
                if (index % 2 == 0) { //짝수
                    result.append(Character.toUpperCase(c));
                } else { //홀수
                    result.append(Character.toLowerCase(c));
                }
                index++;
            }
        }
        return result.toString();
    }
}
