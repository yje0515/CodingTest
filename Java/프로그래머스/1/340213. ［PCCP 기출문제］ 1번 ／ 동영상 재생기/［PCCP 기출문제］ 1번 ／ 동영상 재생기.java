class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        //1.커맨드를 읽고
        //2.전체 비디오 길이 내에서 입력이 모두 끝난 후 동영상의 위치 "00:00" 형태로 return
        //1분 -> 60초
        int videoLen = second(video_len); //전체
        int now = second(pos); //현재
        int opStart = second(op_start); //오프닝 시작
        int opEnd = second(op_end); //오프닝 끝
        
        
        for(String command : commands){
            switch(command){
                    case "prev":
                    
                        int prevPos = now - 10;
                        if(prevPos < 0){
                            now = 0;
                        }else if(now >= opStart && now < opEnd){ //현재 위치가 오프닝 구간 안에 있을 때
                            now = opEnd; // 오프닝 건너뛰기
                        }else{
                            now -=10;
                        }
                    
                        break;
                    case "next":
                    
                        int nextPos = now + 10;
                        //다음 위치가 비디오 길이 내에 있을 때
                        if(nextPos < videoLen){
                            //현재 위치는 오프닝 구간 밖에 있고,
                            //다음 위치가 오프닝 구간 안에 들어가게 되면
                            if(now < opStart && nextPos >= opStart && nextPos < opEnd){ 
                                now = opEnd;
                            }else if(now >=  opStart && now <=opEnd && opEnd+10 < videoLen){ //현재 위치가 오프닝 구간 안에 있을 때
                                now = opEnd+10;  //오프닝 끝에서 10초 뒤로 이동
                            }else if(videoLen-nextPos<10){
                                now = videoLen;
                                
                            }else{
                                now +=10;
                            }    
                            
                        //다음 위치가 비디오 길이를 넘어갈 때
                        }else{
                            now = videoLen; //비디오 길이를 넘어가면 비디오 끝으로 이동
                        }   
                    
                        break;
            }
        }
        //결과
        String result = formatTime(now);
        return result;
    }
    
    //1분 -> 60초 분초를 초로 변환하는 메소드
    private static int second(String time){
            int[] arr = new int[2];
            String[] parts = time.split(":");
            arr[0] = Integer.parseInt(parts[0]);
            arr[1] = Integer.parseInt(parts[1]);
            return arr[0]*60+arr[1];
    }
    private static String formatTime(int seconds) {
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
        
}