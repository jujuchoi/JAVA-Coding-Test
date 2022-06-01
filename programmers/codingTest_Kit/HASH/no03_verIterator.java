import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(String[] cloth : clothes){
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        Iterator<Integer> it = map.values().iterator();
        answer = 1;
        while(it.hasNext()){
            answer *= it.next().intValue() + 1;
        }
        
        return answer-1;
    }
}
