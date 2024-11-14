import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for(String pic:picture){
            StringBuilder str = new StringBuilder();
            for(char c:pic.toCharArray()){
                //한 글자씩 k번만큼 str에 추가
                str.append(String.valueOf(c).repeat(k));
            }
            for(int i=0;i<k;i++){
                answer.add(str.toString());
            }
        }
        return answer.toArray(new String[0]);
    }
}