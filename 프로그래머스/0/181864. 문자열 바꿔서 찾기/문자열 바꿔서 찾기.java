class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replaceAll("A","b").replaceAll("B","A")
            .replaceAll("b","B");
        return myString.contains(pat)?1:0;
    }
}