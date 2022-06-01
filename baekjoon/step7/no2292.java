import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int cnt = 1;
		int startNum = 1;
		while(true) {
			if(startNum >= n) {
				break;
			}
			startNum += (6*cnt);
			cnt++;
		}
		System.out.println(cnt);
	}
}
