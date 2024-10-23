
import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> resultList = new ArrayList<>();
        for(int i=0; i<intStrs.length;i++){
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(num>k){
                resultList.add(num);
            }
        }
        int[] answer = new int[resultList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=resultList.get(i);
        }
        return answer;
    }
}