import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> filterList = new ArrayList<>();
        for(String str : arr){
            if(!str.isEmpty()){//비어있지않다면
                filterList.add(str);
            }
        }
        String[] answer = filterList.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}