import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        for(int i=l;i<=r;i++){
            boolean isValid = true;
            
            String str = Integer.toString(i);
            for(int j=0;j<str.length();j++){
                char c = str.charAt(j);
                if(c!='5'&&c!='0'){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                result.add(i);
            }
        }
        int[] answer = new int[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=result.get(i);
        }
        Arrays.sort(answer);
        return result.isEmpty()?new int[]{-1}:answer;
    }
}