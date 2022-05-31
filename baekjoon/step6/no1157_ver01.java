import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toLowerCase();
		int[] cnt = new int[26];
		Arrays.fill(cnt, 0);
		for(int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i)-'a'] += 1;
		}
		int max = 0;
		int index = 0;
		for(int i = 0; i < cnt.length; i++) {
			if(cnt[i] > max) {
				max = cnt[i];
				index = i;
			} else if(cnt[i] == max && cnt[i] != 0) {
				index = 63;
			}
		}
		if(index == 63) {
			System.out.println((char)index);
		} else {
			System.out.println(Character.toString((char)index+65));
		}
		
		br.close();	
	}
}
