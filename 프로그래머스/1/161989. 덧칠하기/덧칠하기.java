class Solution {
    public int solution(int n, int m, int[] section) {
        //section.length 연속된 구역들은 한번에 칠할 수 있음
        //i=section[0] i+=m
        int painted = 0;
        int last = 0;
        for(int start : section){
            if(start>last){
                painted++;
                last = start+m-1;
            }
        }
        return painted;
    }
}