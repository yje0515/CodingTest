class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya","ye","woo","ma"};
        for(String a : babbling){
            for(String b : baby){
                if(a.contains(b+b)){
                    a = "no";
                    break;
                }
                a = a.replace(b," ");
            }
            if(a.trim().isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}