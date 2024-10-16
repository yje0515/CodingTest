import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder result = new StringBuilder();
        int index = 0;
        for(int i=0; i<my_string.length();i++){
            if(index<indices.length && i==indices[index]){
                index++;
            }else{
                result.append(my_string.charAt(i));
            }
        }
        return result.toString();
    }
}