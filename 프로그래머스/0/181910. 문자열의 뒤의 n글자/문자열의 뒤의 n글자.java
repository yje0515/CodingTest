class Solution {
    public String solution(String my_string, int n) {
        String[] arr = my_string.split("");
        String answer = "";
        for(int i=arr.length-n;i<arr.length;i++){
            answer+=arr[i];
        }
        return answer;
    }
}