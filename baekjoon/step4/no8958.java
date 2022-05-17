import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		while(n<1) {
			n = Integer.parseInt(br.readLine());
		}
		
		int score;
		int continuity;
		String line;
		for(int i = 0; i < n; i++) {
			line = br.readLine();
			score = 0;
			continuity = 0;
			for(int j = 0; j < line.length(); j++) {
				if(line.charAt(j) == 'O') {
					continuity++;
					score += continuity;
				} else {
					continuity = 0;
				}
			}
			System.out.println(score);
		}
		br.close();
	}
}

