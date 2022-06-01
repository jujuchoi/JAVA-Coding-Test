import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] stringNum = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            stringNum[i] = numbers[i]+"";
        }
        Arrays.sort(stringNum, new Comparator<String>(){
        	public int compare(String o1, String o2){
            	return (o2 + o1).compareTo(o1 + o2);
            }
        });
        
        String answer = "";
        for(int i = 0; i < numbers.length; i++){
        	answer += stringNum[i];
        }
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
