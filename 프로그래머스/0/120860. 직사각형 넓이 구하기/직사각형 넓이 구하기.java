class Solution {
    public int solution(int[][] dots) {
        int a = 256;
        int b = -256;
        int c = 256;
        int d = -256;

        for(int[] dot:dots){
            int x = dot[0];
            int y = dot[1];
            a = Math.min(x,a);
            b = Math.max(x,b);
            c = Math.min(y,c);
            d = Math.max(y,d);
        }
        int width = b - a;
        int height = d - c;
        return width * height;
    }
}
