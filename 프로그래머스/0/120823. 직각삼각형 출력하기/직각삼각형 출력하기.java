import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            int index = 0;
            while(i!=index){
                System.out.print("*");
                index++;
            }
            System.out.println();
        }
    }
}