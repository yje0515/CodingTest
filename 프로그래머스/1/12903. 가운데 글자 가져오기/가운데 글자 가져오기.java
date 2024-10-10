class Solution {
    public String solution(String s) {
        String[] arr= s.split("");
        int n = arr.length;
        return n%2==0?arr[(n/2)-1]+arr[n/2]:arr[n/2];
    }
}