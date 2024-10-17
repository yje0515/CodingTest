import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        String b = String.join("",beforeArr);
        String a = String.join("",afterArr);
        return b.equals(a)?1:0;
    }
}