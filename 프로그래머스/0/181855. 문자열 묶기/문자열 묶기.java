import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] num = new int[31];
        for(int i=0;i<strArr.length;i++){
            num[strArr[i].length()]++;
        }
        Arrays.sort(num);
        return num[num.length-1];
    }
}