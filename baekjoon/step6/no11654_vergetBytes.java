import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		byte[] bytes = n.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes[0]);
		sc.close();
	}
}
