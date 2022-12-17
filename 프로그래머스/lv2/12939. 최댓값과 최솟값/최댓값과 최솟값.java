import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s, " ");
        List<Integer> list = new ArrayList<>();

        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }

        sb.append(Collections.min(list)).append(" ").append(Collections.max(list));

        return String.valueOf(sb);
    }
}