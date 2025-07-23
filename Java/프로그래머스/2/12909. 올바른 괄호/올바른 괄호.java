class Solution {
    boolean solution(String s) {
        //count가 음수가 되는 순간 false 반환
        int count = 0;
        for(int i=0;i<s.length();i++){
            count = (s.charAt(i)=='(')?count+1:count-1;
            if(count<0){
                return false;
            }
        }
        return count!=0?false:true;
        
    
    }
}