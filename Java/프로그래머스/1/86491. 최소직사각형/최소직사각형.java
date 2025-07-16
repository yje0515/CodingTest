class Solution {
    public int solution(int[][] arr) {
        int maxWidth = 0;
        int maxHeight = 0;
        for(int i=0; i<arr.length; i++){
            //[0]에 큰 값을 넣어줌
            if(arr[i][0]<arr[i][1]){
                int temp = arr[i][0];
                arr[i][0] = arr[i][1];
                arr[i][1] = temp;
            }
        }

        for(int i=0; i<arr.length; i++){
            maxHeight=  Math.max(maxHeight, arr[i][1]);
            maxWidth = Math.max(maxWidth, arr[i][0]);
        }
        return maxWidth * maxHeight;
    }
}