import java.util.*;

class Solution {
    public String[] solution(String[] names){
        //0,5,10번째 인덱스
       List<String> answer = new ArrayList<>();
        for(int i=0; i<names.length;i+=5){
            answer.add(names[i]);
        }
        return answer.toArray(new String[0]);
    }
}