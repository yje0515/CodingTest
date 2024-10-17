import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        return Arrays.equals(afterArr,beforeArr)?1:0;
    }
}