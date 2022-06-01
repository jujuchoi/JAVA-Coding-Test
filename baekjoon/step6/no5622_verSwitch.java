import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String phoneNum = br.readLine();
		int time = 0;
		for(int i = 0; i < phoneNum.length(); i++) {
			char numOne = phoneNum.charAt(i);
			time += numTime(numOne);
		}
		System.out.println(time);
		br.close();
	}
	private static int numTime(char num) {
		switch(num) {
			case 'A':
			case 'B':
			case 'C':
				return 3;
			case 'D':
			case 'E':
			case 'F':
				return 4;
			case 'G':
			case 'H':
			case 'I':
				return 5;
			case 'J':
			case 'K':
			case 'L':
				return 6;
			case 'M':
			case 'N':
			case 'O':
				return 7;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				return 8;
			case 'T':
			case 'U':
			case 'V':
				return 9;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				return 10;
			default:
				return 0;
		}
	}
}
