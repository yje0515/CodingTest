class Solution {
    public int solution(int order) {
        int[] arr = new int[(int)Math.log10(order)+1];
        int count = 0;
        for(int i=0; i<arr.length;i++){
            arr[i] = order%10;
            order = order/10;
            if(arr[i]==3||arr[i]==6||arr[i]==9){
                count++;
            }
        }
        return count;
    }
}