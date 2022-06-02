import java.util.*;
class Solution {
    class Task{
        int location;
        int priority;
        
        public Task(int location, int priority){
            this.location = location;
            this.priority = priority;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Task> task = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++){
            task.add(new Task(i, priorities[i]));
        }
        
        int now = 0; 
        while(!task.isEmpty()){
            // 큐 맨 앞에 있는 task 꺼내서 cur에 저장
            Task cur = task.poll();
            boolean flag = false;
            for(Task t : task){
                // cur의 priority와 큐의 priority 비교
                if(t.priority > cur.priority){
                    flag = true;
                }
            }
            if(flag){ // 현재 priority보다 큐 맨 앞에 있는 priority가 클 때 cur를 task 뒤에 추가하기
                task.add(cur);
            } else { // 현재 priority가 큐 맨 앞에 있는 priority보다 클 때 now++
                now++;
                // cur의 location이 location가 동일하면 now 출력하기
                if(cur.location == location){
                    answer = now;
                    break;
                }
            }
        }
        return answer;
    }
}
