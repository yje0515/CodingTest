class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerSum = numer1*denom2+numer2*denom1;
        int denomSum = denom1*denom2;
        int gcd = gcd(numerSum,denomSum);
        return new int[] {numerSum/gcd,denomSum/gcd};
    }
    private int gcd(int a,int b){
        //나머지가 0이 될 때 까지
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp; //나머지값
        }
        return a;
    }
} 