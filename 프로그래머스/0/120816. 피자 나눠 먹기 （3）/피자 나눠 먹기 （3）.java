class Solution {
    public int solution(int slice, int n) {
        int pizza = 0;
        //slice/n>1
        while((pizza*slice)/n<1){
            pizza++;
        }
        return pizza;
    }
}