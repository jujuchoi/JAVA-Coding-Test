import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {        
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            // 나머지가 있을 경우 + 1 day 해야하므로 double로 형변환, Math 올림 함수 사용하여 date 계산
            int date = (int) Math.ceil(remain);

            if (!q.isEmpty() && q.peek() < date) {
                // queue에 date가 들어있을 경우 값 비교 후 계산한 date보다 작으면
                // list에 개수 추가, 큐 비우기 
                answerList.add(q.size());
                q.clear();
            }
            // 큐가 비워져 있는 경우 큐에 date 추가하기
            q.offer(date);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    
    }
}
