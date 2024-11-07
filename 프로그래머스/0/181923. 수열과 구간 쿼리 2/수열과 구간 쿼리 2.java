class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int tmp = 1000000;
            int start = queries[i][0];
            int end = queries[i][1];
            int k = queries[i][2];
            for(int j=start;j<=end;j++){
                if(arr[j]>k && arr[j]<=tmp){
                    tmp = arr[j];
                }
            }
            answer[i] = (tmp==1000000)?-1:tmp;
        }
        return answer;
    }
}