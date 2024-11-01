class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)){
            return 0;
        }
        String tmp = A;
        for(int i=1;i<A.length();i++){
            tmp = tmp.charAt(tmp.length()-1)+tmp.substring(0,tmp.length()-1);
            if(tmp.equals(B)){
                return i;
            }
        }
        return -1;
    }
}