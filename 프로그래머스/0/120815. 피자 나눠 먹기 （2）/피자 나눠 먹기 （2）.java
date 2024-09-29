class Solution {
    public int solution(int n) {
        //pizza * 6 % n ==0 일때 pizza의 갯수
        int pizza = 1;
        while((pizza*6)%n!=0){
            pizza++;
        }return pizza;
        
    }
}