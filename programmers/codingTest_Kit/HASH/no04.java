import java.util.*;
class Solution {
    static class Music{
        String genre;
        int play;
        int idx;
        
        public Music(String genre, int play, int idx){
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            // key: 장르, value: 장르 중 제일 많은 재생 횟수
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        // 1. 장르 선정
        ArrayList<String> genre = new ArrayList<>();
        while(map.size() != 0){
            int max = -1;
            String max_key = "";
            for(String key : map.keySet()){
                int temp = map.get(key);
                if(temp > max){
                    max = temp;
                    max_key = key;
                }
            }
            genre.add(max_key);
            map.remove(max_key);
        }
        
        // 2. 장르 내 노래 선정
        ArrayList<Music> result = new ArrayList<>();
        for(String g : genre){
            ArrayList<Music> list = new ArrayList<>();
            for(int i = 0; i < genres.length; i++){
                if(genres[i].equals(g)){
                    list.add(new Music(g, plays[i], i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play);
            result.add(list.get(0));
            if(list.size() != 1){
                result.add(list.get(1));
            }
        }
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i).idx;
        }
        
        return answer;
    }
}
