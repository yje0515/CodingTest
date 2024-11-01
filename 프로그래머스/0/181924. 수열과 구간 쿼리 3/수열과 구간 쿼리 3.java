class Solution {
    public int[] solution(int[] arr, int[][] queries) {
            for(int j=0;j<queries.length;j++){
                int tmp = arr[queries[j][0]];
                arr[queries[j][0]] = arr[queries[j][1]];
                arr[queries[j][1]] = tmp;
            }
        return arr;
    }
}