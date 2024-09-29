class Solution {
    public int solution(int n) {
        double num = Math.sqrt(n);
        if(num%1>0){
            return 2;
        }else{
            return 1;
        }
    }
}