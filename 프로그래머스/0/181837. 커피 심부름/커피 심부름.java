class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String a : order){
            answer+=(a.contains("latte"))?5000:4500;
        }
        return answer;
    }
}