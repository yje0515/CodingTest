import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> result = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        switch(n){
            case 1:
                for(int i=0;i<=b;i++){
                    result.add(num_list[i]);
                }
                break;
                
            case 2:
                for(int i=a;i<num_list.length;i++){
                    result.add(num_list[i]);
                }
                break;
            
            case 3:
                for(int i=a;i<=b;i++){
                    result.add(num_list[i]);
                }
                break;
            
            case 4:
                for(int i=a;i<=b;i+=c){
                    result.add(num_list[i]);
                }
                break;
        }
        int[] answer = new int[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
}