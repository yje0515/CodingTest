import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0;
        for(int i=0;i<d.length;i++){
            budget -=d[i];
            if(budget>=0){
                cnt++;
            }
        }
        return cnt;
    }
}