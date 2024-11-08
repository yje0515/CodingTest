class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        
        for (String direction : keyinput) {
            if (direction.equals("left") && answer[0] > -xLimit) {
                answer[0]--;
            } else if (direction.equals("right") && answer[0] < xLimit) {
                answer[0]++;
            } else if (direction.equals("up") && answer[1] < yLimit) {
                answer[1]++;
            } else if (direction.equals("down") && answer[1] > -yLimit) {
                answer[1]--;
            }
        }
        
        return answer;
    }
}
