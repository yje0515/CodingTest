import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            if(result.isEmpty()){
                result.add(arr[i]);
                i++;
            }else if(result.get(result.size()-1)<arr[i]){
                result.add(arr[i]);
                i++;
            }else if(result.get(result.size()-1)>=arr[i]){
                result.remove(result.size()-1);
            }
        }
        int[] answer = new int[result.size()];
        for(int j=0;j<answer.length;j++){
            answer[j]=result.get(j);
        }
        return answer;
    }
}