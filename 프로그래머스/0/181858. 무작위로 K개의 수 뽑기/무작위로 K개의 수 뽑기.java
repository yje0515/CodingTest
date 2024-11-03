import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        for(int a : arr){
            if(!result.contains(a)){
                result.add(a);
            }
        }
        while(result.size()<k){
            result.add(-1);
        }
        int[] answer = new int[k];
        for(int i=0;i<answer.length;i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
}