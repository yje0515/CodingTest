class Solution {
    public int solution(String num_str) {
        String[] arr = num_str.split("");
        int answer = 0;
        for(String num : arr){
            answer+= Integer.parseInt(num);
        }
        return answer;
    }
}