class Solution {
    public int solution(int i, int j, int k) {
        int count=0;
        char target = (char) (k+'0');
        for(int index=i;index<=j;index++){
            String str = Integer.toString(index);
            for(int z=0;z<str.length();z++){
                char c = str.charAt(z);
                if(c==target){
                    count++;
                }
            }
        }
        return count;
    }
}