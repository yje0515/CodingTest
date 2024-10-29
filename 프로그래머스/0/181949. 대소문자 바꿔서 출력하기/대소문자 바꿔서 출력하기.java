import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            String s = (Character.isUpperCase(c))?
                String.valueOf(c).toLowerCase()
                :String.valueOf(c).toUpperCase();
            str.append(s);
        }
        System.out.print(str.toString());
    }
}