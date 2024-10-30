class Solution {
    public String[] solution(String my_str, int n) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<my_str.length();i++){
            result.append(my_str.charAt(i));
            if((i+1)%n==0){
                result.append(",");
            }
        }
        String[] answer = result.toString().split(",");
        return answer;
    }
}