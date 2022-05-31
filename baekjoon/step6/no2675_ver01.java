import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken()), r;
		String s;
		for(int i = 0; i < cnt; i++) {			
			st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			s = st.nextToken();
			
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < r; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
		
		br.close();
	}
}

