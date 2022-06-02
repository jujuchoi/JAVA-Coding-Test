import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        Queue<Integer> que = new LinkedList<>();
        
        int tol = 0;
        int time = 0;
        for(Integer truck : truck_weights){
            while(true){
                if(que.isEmpty()){
                    // 다리에 트럭이 한 대도 없을 때
                    que.add(truck);
                    tol += truck;
                    time++;
                    break; // 여기서 끊어줘야 next index로 for문 돌릴 수 있음
                } else if(que.size() == bridge_length){
                    tol -= que.poll();
                } else {
                    if(tol + truck <= weight){
                        que.add(truck);
                        tol += truck;
                        time++;
                        break;
                    } else {
                        que.add(0);
                        time++;
                    }
                }
            }
        }
        
        return time + bridge_length;
    }
}
