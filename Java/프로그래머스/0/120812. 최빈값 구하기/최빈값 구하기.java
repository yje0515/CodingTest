import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int[] num = new int[array[array.length - 1] + 1];
        for (int a : array) {
            num[a]++;
        }
        int max = -1;
        int index = -1;
        for (int i = 0; i < num.length; i++) { //빈도수
            if (num[i] > max) {
                max = num[i];
                index = i;
            } else if (num[i] == max) {
                index = -1;
            }
        }
        return index;
    }
}