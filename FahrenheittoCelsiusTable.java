// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		int S=a.nextInt();
		int E=a.nextInt();
		int W=a.nextInt();
		int c;
		while(S<=E)
		{
			c=(5*(S-32))/9;
			System.out.println(S+"\t"+c);
			S=S+W;
		}
	}

}
