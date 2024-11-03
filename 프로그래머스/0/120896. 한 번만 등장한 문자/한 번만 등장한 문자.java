import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split("");
        Arrays.sort(arr);
        for(String a:arr){
            int count = 0;
            for(String b:arr){
                if(a.equals(b)){
                    count++;
                }
            }
            if(count == 1){
                answer.append(a);
            }
        }
        return answer.toString();
    }
}