import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        int h_index = 0;
        for(int i = citations.length - 1; i >= 0; i--){
            if(h_index < citations[i]){
                h_index++;
            }
        }
        answer = h_index;
        return answer;
    }
}
