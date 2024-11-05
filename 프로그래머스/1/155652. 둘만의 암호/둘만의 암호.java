class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        for(char c :s.toCharArray()){
            int count = 0;
            while(count<index){
                c++;
                if(c>'z'){
                    c = 'a';
                }
                boolean isSkip = false;
                for(int j=0;j<skip.length();j++){
                    if(c == skip.charAt(j)){
                        isSkip = true;
                        break;
                    }
                }
                if(!isSkip){
                    count++;
                }
            }
            answer.append(c);
        }
        return answer.toString();
    }
}