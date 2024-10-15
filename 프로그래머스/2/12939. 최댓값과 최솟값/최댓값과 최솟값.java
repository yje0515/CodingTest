class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int min = 10000;
        int max = -10000;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        answer = min+" "+max;
        return answer;
        
    
    }
}