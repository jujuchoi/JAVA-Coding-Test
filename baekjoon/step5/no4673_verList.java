import java.util.ArrayList;
import java.util.List;

class Main {
    static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		for(int i = 1; i <= 10000; i++) {
			d(i);
		}
		for(int i = 1; i <= 10000; i++) {
			if(list.contains(i)==false) {
				System.out.println(i);
			}
		}
	}
	
	static void d(int n) {		
		int temp = n, sum = n;
		if(temp <= 10000 && list.contains(temp)==false) {
			while(temp > 0) {
				sum += temp%10;
				temp/=10;
			}
			d(sum);
			list.add(sum);
		}
	}
}
