import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<flag.length;i++){
            if(flag[i]){
                for(int j=0;j<arr[i]*2;j++){
                    result.add(arr[i]);
                }
            }else{
                if(!result.isEmpty()){
                    for(int z=0;z<arr[i];z++){
                     result.remove(result.size()-1);
                    }
                }
            }
        }
        int[] answer = new int[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
}