import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];
        for(int i=0; i<score.length;i++){
            if(i>=k){
                int min = Collections.min(list);
                if(min<score[i]){
                    list.remove(list.indexOf(min));
                    list.add(score[i]);
                }
            }else{
                list.add(score[i]);
            }
            answer[i] = Collections.min(list);
        }
        return answer;
    }
}