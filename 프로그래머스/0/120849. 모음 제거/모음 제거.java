class Solution {
    public String solution(String my_string) {
        String[] str={"a","e","i","o","u"};
        for(int i=0; i<str.length; i++){
            my_string = my_string.replace(str[i],"");
        }return my_string;
    }
}