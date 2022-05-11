import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		int H = scanner.nextInt();
        while(H < 0 || H > 23) {
			H = scanner.nextInt();
		}
        
		int M = scanner.nextInt();
		while(M < 0 || M > 59) {
			M = scanner.nextInt();
		}
		
		if(H == 0 && M < 45) {
			H = 23;
            		M = 45 - M;
			M = 60 - M;
		} else if(M < 45) {
			H -= 1;
            		M = 45 - M;
			M = 60 - M;
		} else {
            		M -= 45;
        }
		
		System.out.println(H + " " + M);
		
		scanner.close();
	}
}

