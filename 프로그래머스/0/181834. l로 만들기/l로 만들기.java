class Solution {
    public String solution(String myString) {
        //->배열->아스키코드 108->문자열
        char[] arr = myString.toCharArray();
        for(int i=0; i<arr.length;i++){
            if(arr[i]<108){
                arr[i] = 'l';
            }
        }
        String answer = new String(arr);
        return answer;
    }
}