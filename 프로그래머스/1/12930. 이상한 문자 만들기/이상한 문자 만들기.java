class Solution {
    public String solution(String s) {
        StringBuilder answer =new StringBuilder();
        String[] arr = s.split(" ",-1);
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            for(int j=0; j<str.length();j++){
                char c =str.charAt(j);
                if(j%2==0){
                    answer.append(Character.toUpperCase(c));
                }else{
                    answer.append(Character.toLowerCase(c));
                }
            }
            if(i<arr.length-1){
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}