class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int tmp = 1000;
        for(int a:array){
            int num = Math.abs(a-n);//절대값
            if(num < tmp || (num==tmp && a<answer)){
                tmp = num;
                answer = a;
            }
        }
        return answer;
    }
}