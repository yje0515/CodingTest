class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String answer = "";
        for(int i=0;i<todo_list.length;i++){
            if(!finished[i]){
                if(i<todo_list.length-1){
                    answer += todo_list[i]+",";
                }else{
                    answer += todo_list[i];
                }
            }
        }
        return answer.split(",");
    }
}