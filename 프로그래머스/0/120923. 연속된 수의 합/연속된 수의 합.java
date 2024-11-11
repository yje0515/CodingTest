class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        //시작값 계산
        int start = (total-(num*(num-1)/2))/num;
        for(int i=0;i<num;i++){
            answer[i] = start+i;
        }
        return answer;
    }
}