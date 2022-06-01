import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(String[] cloth : clothes){
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        answer = 1;
        for(Integer v : map.values()){
            answer *= v +1;
        }
                
        return answer-1;
    }
}
