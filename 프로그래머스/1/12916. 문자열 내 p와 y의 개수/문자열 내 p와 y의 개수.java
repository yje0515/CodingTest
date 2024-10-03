class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        for(int a : s.toLowerCase().toCharArray()){
            if(a=='p'){countP++;}
            if(a=='y'){countY++;}
        }
        if(countP!=countY){
            answer=false;
        }
        return answer;
    }
}