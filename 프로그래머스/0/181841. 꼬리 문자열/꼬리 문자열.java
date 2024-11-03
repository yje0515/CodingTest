class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        for(String a : str_list){
            if(!a.contains(ex)){
                answer.append(a);
            }
        }
        return answer.toString();
    }
}