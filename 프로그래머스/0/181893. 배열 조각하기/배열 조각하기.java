import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;
        for(int i=0;i<query.length;i++){
            if(i%2==0){//짝수/뒷부분
                end = start+query[i]+1;
            }else{//홀수/앞부분
                start += query[i];
            }
        }
        return Arrays.copyOfRange(arr,start,end);
    }
}