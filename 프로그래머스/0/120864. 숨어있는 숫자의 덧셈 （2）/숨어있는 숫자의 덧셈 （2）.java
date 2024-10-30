class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder tmp = new StringBuilder();
        for(int i=0;i<my_string.length();i++){
            char c = my_string.charAt(i);
            if(c>='0'&&c<='9'){
                tmp.append(c);
            }else{
                if(tmp.length()>0){
                    answer += Integer.parseInt(tmp.toString());
                    tmp.setLength(0);//초기화
                }
            }
        }
        if(tmp.length()>0){
            answer += Integer.parseInt(tmp.toString());
            tmp.setLength(0);//초기화
        }
        return answer;
    }
}