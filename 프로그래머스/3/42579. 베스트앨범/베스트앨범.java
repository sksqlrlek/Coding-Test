import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotal = new HashMap<>();
        Map<String, List<int[]>> map = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++) {
            genreTotal.put(genres[i], genreTotal.getOrDefault(genres[i], 0) + plays[i]);
            map.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new int[]{i, plays[i]});
        }
        
        List<String> list = new ArrayList<>(genreTotal.keySet());
        list.sort((a, b) -> genreTotal.get(b) - genreTotal.get(a));
        
        List<Integer> answer = new ArrayList<>();
        
        for(String genre : list) {
            List<int[]> song = map.get(genre);
            
            song.sort((a, b) -> {
                if(b[1] == a[1]) return a[0] - b[0];
                return b[1] - a[1];
            });
            
            for(int i = 0; i < Math.min(2, song.size()); i++) {
                answer.add(song.get(i)[0]);
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}