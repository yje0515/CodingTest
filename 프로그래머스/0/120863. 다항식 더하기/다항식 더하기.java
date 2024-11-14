class Solution {
    public String solution(String polynomial) {
        int x = 0;
        int n = 0;
        String[] arr = polynomial.split(" "); // 공백 기준으로 분리

        for (String a : arr) {
            if (a.contains("x")) {
                // 'x'가 포함된 항의 계수를 추출
                if (a.equals("x")) {
                    x++;
                } else {
                    x += Integer.parseInt(a.replace("x", ""));
                }
            } else if (!a.equals("+")) {
                // 상수항인 경우
                n += Integer.parseInt(a);
            }
        }

        StringBuilder answer = new StringBuilder();
        if (x > 0) {
            if (x == 1) {
                answer.append("x");
            } else {
                answer.append(x).append("x");
            }
        }
        if (n > 0) {
            if (x > 0) {
                answer.append(" + ");
            }
            answer.append(n);
        }

        return answer.toString();
    }
}
