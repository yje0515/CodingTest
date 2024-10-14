class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String hidden = "*".repeat(length-4);
        String num = phone_number.substring(length-4);
        return hidden+num;
        
    }
}