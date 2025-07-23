class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int num = Integer.parseInt(arr[0]);
        int max = num;
        int min = num;
        for(String a : arr){
            int i = Integer.parseInt(a);
            max = (max>i)?max:i;
            min = (min<i)?min:i;
        }
        return min+" "+max;
        
    }
}