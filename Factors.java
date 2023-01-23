// Write a program to print all the factors of a number other than 1 and the number itself.

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.print("");
        int n = s.nextInt();
        if(n>=0 && n<=10000){
            for(int i = 2; i <= n/2; i++) {
                if(n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }else{
            System.out.println("Invalid input, Please enter a number between 0 and 10000.");
        }
        
    }
}
