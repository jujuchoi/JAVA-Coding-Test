import java.util.*;

class Solution {
    class Task{
        int point;
        int time;
        
        public Task(int point, int time){
            this.point = point;
            this.time = time;
        }
    }
    public int solution(int[][] jobs) {
        // 대기 큐
        PriorityQueue<Task> waitQue = new PriorityQueue(new Comparator<Task>(){
            @Override
            public int compare(Task t1, Task t2){
                return t1.point - t2.point;
            }
        });
        for(int[] job : jobs){
            waitQue.add(new Task(job[0], job[1]));
        }
        
        // 작업 큐
        PriorityQueue<Task> workQue = new PriorityQueue(new Comparator<Task>(){
            @Override
            public int compare(Task t1, Task t2){
                return t1.time - t2.time;
            }
        });
        
        
        int cnt = 0;
        int sum = 0;
        int time = 0;
        while(cnt < jobs.length){
            while(!waitQue.isEmpty() && time >= waitQue.peek().point){
                workQue.offer(waitQue.poll());
            }
            if(!workQue.isEmpty()){
                Task t = workQue.poll();
                sum += t.time + (time - t.point);
                time += t.time;
                cnt++;
            } else {
                time++;
            }
        }
        return sum/cnt;
    }
}
