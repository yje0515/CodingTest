class Solution {
    public int[] solution(int[] arr, int n) {
        int index = (arr.length%2==0)?1:0;
        while(index<arr.length){
            arr[index]+=n;
            index+=2;
        }
        return arr;
    }
}