import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		HashMap<Character, Integer> hm;
		
		loop:
		while(n-- > 0) {
			String str = br.readLine();
			hm = new HashMap<>();
			for(int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if(hm.containsKey(c)) {
					if(hm.get(c) + 1 != j) {
						continue loop;
					} else {
						hm.replace(c, j);
					} 
				} else {
					hm.put(c, j);
				}
			}
			cnt++;
		}
		System.out.println(cnt);
		br.close();
	}
}
