import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("");
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(+ n * i);
        }
	}
}
