class Solution {
    public String solution(String myString, String pat) {
        int last = myString.lastIndexOf(pat);
        return myString.substring(0,last+pat.length());
    }
}