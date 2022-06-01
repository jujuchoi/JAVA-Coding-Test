import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int[] command = commands[i];
            int startNum = command[0];
            int endNum = command[1];
            int idx = command[2];
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = startNum - 1; j < endNum; j++){
                temp.add(array[j]);
            }
            Collections.sort(temp);
            answer[i] = temp.get(idx-1);
        }
        return answer;
    }
}
