import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		loop:
			while(n-- > 0) {
				String word = br.readLine();
				int len = word.length();
				int[] position = new int[26];
				for(int i = 0; i < len; i++) {
					int alphabet = word.charAt(i) - 'a';
					int p = position[alphabet];
					if(p == 0 || p == i) { // 등장한 적이 없거나 i랑 같을 때
						position[alphabet] = i + 1;
						continue; // for문 진행
					}
					//System.out.println("! 그룹 단어 : " + word);
					continue loop; // while문 진행
				}
				//System.out.println("그룹 단어 : " + word);
				cnt++;
			}
		br.close();
		System.out.println(cnt);
	}
}
