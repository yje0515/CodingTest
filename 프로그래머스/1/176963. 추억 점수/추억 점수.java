import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> score = new HashMap<>();
        for(int i=0;i<name.length;i++){
            score.put(name[i],yearning[i]);
        }
        for(int j=0;j<photo.length;j++){
            for(String a : photo[j]){
                answer[j]+=score.getOrDefault(a,0);
            }
        }
        return answer;
    }
}