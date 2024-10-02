class Solution {
    public int solution(int num) {
        int count = 0;
        long n = (long)num;
        while(n!=1){
            if(n%2==0){
               n = n/2; 
            }else{
                n =n*3+1;
            }
            count++;
            if(count==500&&n!=1){
                return -1;
            }
        }
        return num==1?0:count;
    }
}