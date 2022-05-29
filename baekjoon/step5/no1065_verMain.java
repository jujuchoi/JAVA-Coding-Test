import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int N = Integer.parseInt(input);
		int len = input.length();
		int result = 0;
		
		if(len <= 2) {
			result = N;
		} else {
			result = 99;
			for(int i = 100; i <= N; i++) {
				int hun = i / 100;
				int ten = (i % 100) / 10;
				int one = i % 10;
				
				if((hun - ten) == (ten - one)) {
					result++;
				}
			}
		}
		System.out.print(result);
		br.close();
	}
}
