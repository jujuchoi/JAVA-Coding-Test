import java.util.Scanner;

class Main {
	private static Scanner scanner = new Scanner(System.in);
	
	public static int Val(int num) {
		while(num < 1 || num > 6) {
			num = scanner.nextInt();
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		int first = Val(scanner.nextInt());
		int second = Val(scanner.nextInt());
		int third = Val(scanner.nextInt());
		
		int result = 0;
		
		if(first == second && second == third && first == third) {
			result = 10000 + first*1000;
		} else if((first == second) || 
				  (first == third)) {
			result = 1000 + first*100;
		} else if(second == third){
			result = 1000 + second*100;
		} else {
			result = Math.max(first, Math.max(second, third)) * 100;
		}
		System.out.print(result);
		scanner.close();
	}
}
