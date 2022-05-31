import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		char[] num1 = st.nextToken().toCharArray();
		char[] num2 = st.nextToken().toCharArray();
		
		String max = "";
		for(int i=num1.length-1; i>=0; i--) {
			if(num1[i] > num2[i]) {
				for(int j = num1.length-1; j>=0; j--) {
					max += num1[j];
				}
				break;
			} else if(num1[i] == num2[i]) {
				continue;
			} else {
				for(int j = num1.length-1; j>=0; j--) {
					max += num2[j];
				}
				break;
			}
		}
		System.out.println(max);
		br.close();
	}
}
