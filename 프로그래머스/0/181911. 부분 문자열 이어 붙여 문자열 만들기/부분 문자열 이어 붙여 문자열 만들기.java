class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int index = 0;
        for(int i=0;i<my_strings.length;i++){
            answer+=my_strings[i].substring(parts[i][index],parts[i][index+1]+1);
        }
        return answer;
    }
}