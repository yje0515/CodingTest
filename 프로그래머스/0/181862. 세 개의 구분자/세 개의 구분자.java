import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("[abc]");
        List<String> result = new ArrayList<>();
        for (String a : arr) {
            if (!a.isEmpty()) {
                result.add(a);
            }
        }
        if (result.isEmpty()) {
            return new String[] {"EMPTY"};
        }
        return result.toArray(new String[0]);
    }
}
