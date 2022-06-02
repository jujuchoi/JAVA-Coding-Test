import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        for(int s : scoville){
            minQueue.add(s);
        }
        
        while(minQueue.peek() < K){
            int a = minQueue.remove();
            if(minQueue.isEmpty()){
                answer = -1;
                break;
            }
            int b = minQueue.remove();
            int c = a + b * 2;
            
            minQueue.add(c);
            answer++;
        }
        
        return answer;
    }
}
