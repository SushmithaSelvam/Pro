import java.util.Scanner;

public class PangramCheaker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a String");
		String string = scanner.next();
		String str = string.toLowerCase();
		int count = 0;
		for (char i = 'a'; i < 'z'; i++) {
			if (!str.contains(i + "")) {
				count = 1;
			}
		}
		if (count == 0) {
			System.out.println(str + " is a pangram");
		} else {
			System.out.println(string + " is not a pangram");
		}
		scanner.close();
	}
}
