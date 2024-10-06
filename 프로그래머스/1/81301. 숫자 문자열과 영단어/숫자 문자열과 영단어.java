class Solution {
    public int solution(String s) {
        String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        char[] charArr = s.toCharArray();
        String tmp ="";
        String result="";
        for(int i=0; i<charArr.length;i++) {
        	if(charArr[i]<'0' || '9'<charArr[i]) {
        		tmp+=charArr[i];
        	}else {
        		result += charArr[i];
        	}
        	if(tmp.length()>2) {
        		for(int j=0; j<str.length; j++) {
        			if(tmp.equals(str[j])) {
        				tmp="";
        				result+=j;
        			}
        		}
        	}
        }return Integer.parseInt(result);
    }
}
