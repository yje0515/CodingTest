import java.math.*;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = result(balls,share);
        return answer;
    }
    
    public static BigInteger result (int n, int m){
        if (n == m) {
            return BigInteger.ONE;
        }
        //divide : BigInteger 나누기
        return factorial(n).divide(factorial(m).multiply(factorial(n - m)));
    }
    
    public static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for(int i=n; i>1;i--){
            //multiply : BigInteger 곱셈
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}