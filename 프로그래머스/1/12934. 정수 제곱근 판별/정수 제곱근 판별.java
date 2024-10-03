class Solution {
    public long solution(long n) {
        long x = (long)Math.sqrt(n);
        return x>0&&x*x==n?(x+1)*(x+1):-1;
    }
} 