class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        for (String input : keyinput) {
            switch (input) {
                case "left":
                    answer[0]--;
                    break;
                case "right":
                    answer[0]++;
                    break;
                case "up":
                    answer[1]++;
                    break;
                case "down":
                    answer[1]--;
                    break;
            }
            answer[0] = Math.max(-xLimit, Math.min(xLimit, answer[0]));
            answer[1] = Math.max(-yLimit, Math.min(yLimit, answer[1]));
        }
        return answer;
    }
}
