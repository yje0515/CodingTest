class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a = intervals[0][0];
        int b = intervals[0][1];
        int c = intervals[1][0];
        int d = intervals[1][1];
        int[] answer = new int[b-a+d-c+2];
        for(int i=0;i<answer.length;i++){
            if(a<=b){
                answer[i]=arr[a++];
            }else if(c<=d){
                answer[i]=arr[c++];
            }
        }
        return answer;
    }
}