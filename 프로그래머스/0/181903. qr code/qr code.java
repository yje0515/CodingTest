class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] arr = code.split("");
        //i%q==r
        for(int i=0; i<arr.length;i++){
            if(i%q==r){
            answer+=arr[i];
            }
        }
        return answer;
    }
}