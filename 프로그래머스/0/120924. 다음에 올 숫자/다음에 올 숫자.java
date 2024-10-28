class Solution {
    public int solution(int[] common) {
        int a = common[1]-common[0];
        if(common[2]-common[1]==a){
            return common[common.length-1]+a;
        }
        int b = common[1]/common[0];
        return common[common.length-1]*b;
    }
}