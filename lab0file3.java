import java.util.Scanner;

public class lab0file3 {
	public static void main(String agrs[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("Total Score: " + (a+b+c));
		System.out.println("Average Score: " + ((a+b+c)/3));
		System.out.println("Stars Earned: " + ((a+b+c)%5));
		scan.close();
	}
}
