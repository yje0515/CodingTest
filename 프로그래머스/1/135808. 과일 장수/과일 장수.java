import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {//1~k점 최저점수*갯수=한
        Arrays.sort(score);
        int answer = 0;
        int index = 0;
        if(score.length%m>0){
            index = score.length%m;
        }
        for(int i=index;i<score.length;i+=m){
            answer+=score[i]*m;
        }
        return answer;
    }
}