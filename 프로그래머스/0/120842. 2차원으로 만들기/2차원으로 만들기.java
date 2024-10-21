class Solution {
    public int[][] solution(int[] num_list, int n) {
        //행 = row 렬 = n
        int rows = num_list.length/n;
        int[][] answer = new int[rows][n];
        for(int i=0; i<rows;i++){
            for(int j=0; j<n;j++){
                answer[i][j]=num_list[i*n+j];//00,0/01,1/10,2/11,3...
            }
        }
        return answer;
    }
}