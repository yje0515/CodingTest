import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> resultList = new ArrayList<>();
        resultList.add(arr[0]);
        for(int i=1; i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                resultList.add(arr[i]);
            }
        }
        int[] answer = new int[resultList.size()];
        for(int j=0; j<answer.length;j++){
            answer[j]=resultList.get(j);
        }
        return answer;
    }
}