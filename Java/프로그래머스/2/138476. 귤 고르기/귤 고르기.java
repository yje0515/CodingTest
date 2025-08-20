import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Arrays.sort(tangerine);
        int num = tangerine[tangerine.length-1];
        int[] cnt = new int[num+1];
        for(int a : tangerine){
            cnt[a]++;
        }
        Arrays.sort(cnt);
        int tan = 0;
        int answer = -1;
        for(int i = cnt.length-1;i>=0;i--){
            tan+=cnt[i];
            if(tan>=k){
                answer = cnt.length-i;
                break;
            }
        }
        return answer;
    }
}