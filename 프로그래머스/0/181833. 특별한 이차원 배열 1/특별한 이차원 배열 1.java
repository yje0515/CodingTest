class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i=0; i<answer.length;i++){
            for(int j=0; j<answer.length;j++){
              answer[i][j]=0;  
            }
            answer[i][i]=1;
        }
        return answer;
    }
}