class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int count = arr.length;
        for(int a:arr){
            for(int d:delete_list){
                if(a==d){
                    count--;
                }
            }
        }
        int[] answer = new int[count];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            boolean save = true;
            for(int d:delete_list){
                if(arr[i]==d){
                    save = false;
                }
            }
            if(save){
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}