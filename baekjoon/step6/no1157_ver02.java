import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] cnt = new int[26];
		Arrays.fill(cnt, 0);
		for(int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i)-'A'] += 1;
		}
		int max = -1;
		char result = '?';
		for(int i = 0; i < cnt.length; i++) {
			if(cnt[i] > max) {
				max = cnt[i];
				result = (char)('A'+i);
			} else if(cnt[i] == max) {
				result = '?';
			}
		}
		System.out.println(result);
		
		br.close();	
	}
}
