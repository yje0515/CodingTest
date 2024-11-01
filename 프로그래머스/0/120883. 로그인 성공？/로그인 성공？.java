class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(String[] a :db){
            String id = id_pw[0];
            String pw = id_pw[1];
            if(id.equals(a[0]) && pw.equals(a[1])){
                return "login";
            }else if(id.equals(a[0]) && !pw.equals(a[1])){
                answer = "wrong pw";
            }else if(!id.equals(a[0]) && !pw.equals(a[1])){
                answer = "fail";
            }
        }
        return answer;
    }
}