import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int i= (array.length)/2;
        return array[i];
    }
}