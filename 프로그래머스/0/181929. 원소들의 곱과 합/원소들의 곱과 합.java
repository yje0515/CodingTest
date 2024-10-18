class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int plus = 0;
        for(int a:num_list){
            multiply *=a;
            plus += a;
        }
        return (multiply>plus*plus)?0:1;
    }
}