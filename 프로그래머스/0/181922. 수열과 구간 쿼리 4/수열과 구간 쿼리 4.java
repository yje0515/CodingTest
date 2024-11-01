class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0;i<arr.length;i++){
            for(int[] query:queries){
                if(query[0]<=i&&query[1]>=i){
                    if(i%query[2]==0){
                        arr[i]++;
                    }
                }
            }
        }
        return arr;
    }
}