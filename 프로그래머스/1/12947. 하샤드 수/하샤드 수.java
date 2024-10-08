class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        while(temp>0){
            //세자리수 이상일 수 있음, 일의 자리 숫자를 더함
            sum+=temp%10;
            temp/=10; //일의 자리를 제거
        }
        return x%sum==0?true:false;
    }
}