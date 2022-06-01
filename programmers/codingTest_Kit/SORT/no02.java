import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] stringNum = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            stringNum[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(stringNum, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return(s2 + s1).compareTo(s1 + s2);
            }
        });
        if(stringNum[0].equals("0")){
            return "0";
        }
        return String.join("", stringNum);
    }
}
