import java.util.*;
class Solution {
    public long solution(String numbers) {
        HashMap<String,Integer> numMap = new HashMap<>();
        numMap.put("zero",0);
        numMap.put("one",1);
        numMap.put("two",2);
        numMap.put("three",3);
        numMap.put("four",4);
        numMap.put("five",5);
        numMap.put("six",6);
        numMap.put("seven",7);
        numMap.put("eight",8);
        numMap.put("nine",9);
        StringBuilder result =new StringBuilder();
        String tmp = "";
        for(int i=0;i<numbers.length();i++){
            tmp+=numbers.charAt(i);
            if(numMap.containsKey(tmp)){//key
                result.append(numMap.get(tmp));//value
                tmp = "";
            }
        }
        return Long.parseLong(result.toString());
    }
}