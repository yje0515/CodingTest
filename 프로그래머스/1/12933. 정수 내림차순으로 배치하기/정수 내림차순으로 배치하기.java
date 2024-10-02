import java.util.*;

class Solution {
    public long solution(long n) {
        //long 타입을 String 문자열로 변환
        String strNum = Long.toString(n);
        //문자열을 배열로
        String[] arr = strNum.split("");
        //배열을 내림차순으로 정렬
        Arrays.sort(arr,Collections.reverseOrder());
        //배열을 String 문자열로 변환
        String sortedStr = String.join("",arr);
        //String 문자열을 long타입으로 변환해서 반환
        return Long.parseLong(sortedStr);
    }
}