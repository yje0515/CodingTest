class Solution {
    public String[] solution(String[] strArr) {
        StringBuilder str = new StringBuilder();
        for(String a : strArr){
            if(!a.contains("ad")){
                str.append(a+",");
            }
        }
        return str.toString().split(",");
    }
}