import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        for(int[] querie:queries){
            int start = querie[0];
            int end = querie[1];
            String str = new StringBuilder(answer.substring(start,end+1)).reverse().toString();
            answer.replace(start,end+1,str);
        }
        return answer.toString();
    }
}