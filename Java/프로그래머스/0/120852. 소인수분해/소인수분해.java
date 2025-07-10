import java.util.*;
class Solution {
    public int[] solution(int n) {
           List<Integer> list = new ArrayList<>();
        
        //2부터 받은 숫자n까지 
        for(int i = 2; i <= n; i++) {
            //만약 i로 나눴을 때 나머지가 0이라면(약수)
            if(n % i == 0) {
                //나머지가 생길 때 까지 i로 나눠준다
                while(n % i == 0) {
                    n /= i;
                }
                //해당 숫자를 리스트에 저장
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}