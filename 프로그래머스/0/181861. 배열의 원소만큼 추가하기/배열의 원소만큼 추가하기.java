import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> resultList = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i];j++){
                resultList.add(arr[i]);
            }
        }
        int[] answer = new int[resultList.size()];
        for(int z=0;z<answer.length;z++){
            answer[z]=resultList.get(z);
        }
        return answer;
    }
}