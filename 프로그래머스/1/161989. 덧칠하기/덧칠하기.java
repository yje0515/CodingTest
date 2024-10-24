class Solution {
    public int solution(int n, int m, int[] section) {
        //section.length 연속된 구역들은 한번에 칠할 수 있음
        //i=section[0] i+=m
        int count = 0;
        int lastPainted = 0;
        for(int a : section){
            if(lastPainted<a){
                count++;
                lastPainted = a+m-1;
            }
        }
        return count;
    }
}