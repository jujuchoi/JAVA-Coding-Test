import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		int a = 97, z = 122;
		for(int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i)-'a']==-1) {
				arr[s.charAt(i)-'a']=i;
			}
		}
		for(int i = 0; i < 26; i++) {
			System.out.print(arr[i] + " ");
		}
		br.close();
	}
}
