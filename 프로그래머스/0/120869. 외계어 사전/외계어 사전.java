class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(String a:dic){
            String tmp = "";
            for(String b:spell){
                if(a.contains(b)){
                    tmp+=b;
                }
            }
            if(tmp.length()==spell.length){
                return 1;
            }
        }
        return 2;
    }
}