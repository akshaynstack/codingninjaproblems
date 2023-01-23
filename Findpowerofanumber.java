// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
// Note : For this question, you can assume that 0 raised to the power of 0 is 1

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("");
        int x = s.nextInt();
        System.out.print("");
        int n = s.nextInt();
        if(x>=0 && x<=8 && n>=0 && n<=9){
            int result = 1;
            for(int i = 1; i <= n; i++) {
                result *= x;
            }
            System.out.println(result);
        }
        
    }
}
