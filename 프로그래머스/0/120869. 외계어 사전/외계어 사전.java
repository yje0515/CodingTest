class Solution {
    public int solution(String[] spell, String[] dic) {
        for(String a:dic){
            int tmp = 0;
            for(String b:spell){
                if(a.contains(b)){
                    tmp++;
                }
            }
            if(tmp==spell.length){
                return 1;
            }
        }
        return 2;
    }
}