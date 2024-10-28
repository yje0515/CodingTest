class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] a = str1.split("");
        String[] b = str2.split("");
        for(int i=0; i<a.length;i++){
            answer+=a[i]+b[i];
        }
        return answer;
    }
}