import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim();
		
		int cnt = 0;
		int word_cnt = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s != null && s.charAt(0) != ' ') {
				if(s.charAt(i) == ' ') {
					cnt++;
				} else if(s != null && s.charAt(i) != ' ') {
					word_cnt = 1;
				}
			}
		}
		if(cnt > 0) {
			word_cnt = cnt + 1;
		}
		System.out.println(word_cnt);
		
	}
}
