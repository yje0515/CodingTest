class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xLimit = board[0]/2;
        int yLimit = board[1]/2;
        for(String a:keyinput){
            if(a.equals("left")){
                answer[0]--;
            }else if(a.equals("right")){
                answer[0]++;
            }else if(a.equals("up")){
                answer[1]++;
            }else if(a.equals("down")){
                answer[1]--;
            }
            answer[0] = Math.max(-xLimit,Math.min(xLimit,answer[0]));
            answer[1] = Math.max(-yLimit,Math.min(yLimit,answer[1]));
        }
        return answer;
    }
}