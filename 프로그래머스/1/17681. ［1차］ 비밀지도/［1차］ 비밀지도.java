class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            int merge = arr1[i] | arr2[i];//OR연산자
            answer[i] = 
                String.format("%"+n+"s",Integer.toBinaryString(merge))
                .replace("1","#").replace("0"," ");
        }
        return answer;
    }
}