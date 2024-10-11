import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> resultList = new ArrayList<>();
        resultList.add(n);
        int num = n;
        while(num!=1){
            num = num%2==0?num/2:num*3+1;
            resultList.add(num);
        }
        int[] answer = new int[resultList.size()];
        for(int i=0; i<answer.length;i++){
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}