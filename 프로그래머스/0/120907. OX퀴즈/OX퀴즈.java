class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int index = 0;
        for(String q : quiz){
            String[] arr = q.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            int c = Integer.parseInt(arr[4]);
            if(arr[1].equals("+")){
                answer[index++] = (a+b==c)?"O":"X";
            }else if(arr[1].equals("-")){
                answer[index++] = (a-b==c)?"O":"X";
            }
        }
        return answer;
    }
}