import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] dial = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		
		int time = 0;
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < dial.length; j++) {
				if(dial[j].contains(str.charAt(i)+"")) {
					time += j + 3;
				}
			}
		}
		System.out.println(time);
	}
}
