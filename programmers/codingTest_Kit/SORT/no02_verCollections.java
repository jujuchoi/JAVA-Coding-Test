import java.util.*;
class Solution {
	List<Integer> list = new ArrayList<>();
		for(int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list, (a, b) -> {
			String as = String.valueOf(a), bs = String.valueOf(b);
			System.out.println("as: " + as + " bs: " + bs);
			System.out.println(list.toString()+"\n");
			return -Integer.compare(Integer.parseInt(as+bs), Integer.parseInt(bs+as));
		});
		StringBuilder sb = new StringBuilder();
		for(Integer i : list) {
			sb.append(i);
		}
		String answer = "";
		answer = sb.toString();
		if(answer.charAt(0) == '0') {
			return "0";
		} else {
			return answer;
		}
}
