import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();
        for(int i=0; i<arr.length; i++){
            if(stk.isEmpty()){
                stk.push(arr[i]);
            }else if(stk.peek()==arr[i]){
                stk.pop();
            }else{
                stk.push(arr[i]);
            }
        }
        if(stk.isEmpty()){
            return new int[]{-1};
        }
        int[] answer = new int[stk.size()];
        for( int i=stk.size()-1;i>=0;i--){
            answer[i] = stk.pop();//역순
        }
        return answer;
    }
}