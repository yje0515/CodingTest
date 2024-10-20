import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        char[] charArr = my_string.toCharArray();
        List<Integer> resultList = new ArrayList<>();
        
        for(int i=0; i<charArr.length; i++){
            if(Character.isDigit(charArr[i])){
                resultList.add(Character.getNumericValue(charArr[i]));
            }
        }
        int[] answer = new int[resultList.size()];
        for(int i=0; i<answer.length;i++){
            answer[i] = resultList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}