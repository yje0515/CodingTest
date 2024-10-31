class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        boolean mode = true;//0
        for(int i=0;i<code.length();i++){
            char c = code.charAt(i);
            if(mode){
                if(c!='1'){
                    if(i%2==0){
                        answer.append(c);
                    }
                }else{
                    mode = (mode)?false:true;
                }
            }else{
                if(c!='1'){
                    if(i%2>0){
                        answer.append(c);
                    }
                }else{
                    mode = (mode)?false:true;
                }
            }
        }
        if(answer.toString().length()==0){
            return "EMPTY";
        }
        return answer.toString();
    }
}