class Solution {
    public int solution(int n) {
        int x = 1;
        while(n%x!=1){
            x++;
        }
        return x;
    }
}