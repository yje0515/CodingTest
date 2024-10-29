class Solution {
    public int[] solution(int[] arr) {
        int newLength = 1;
        int n = arr.length;
        while(newLength<n){
            newLength*=2;
        }
        int[] answer = new int[newLength];
        for(int i=0;i<n;i++){
            answer[i]=arr[i];
        }
        return answer;
    }
}