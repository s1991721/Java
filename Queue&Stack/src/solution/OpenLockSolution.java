package solution;

import java.util.*;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/231/practical-application-queue/1375/
 */
public class OpenLockSolution {

    public static int openLock(String[] deadends, String target) {

        Set<String> visited = new HashSet<String>();
        Set<String> deadEnds = new HashSet<String>(deadends.length);

        deadEnds.addAll(Arrays.asList(deadends));

        Queue<String> queue = new LinkedList();
        queue.offer("0000");
        visited.add("0000");
        int level = 0;

        while (!queue.isEmpty()) {

            int length = queue.size();

            for (int j = 0; j < length; j++) {

                String poll = queue.poll();
                if (poll.equals(target)) {
                    return level;
                }
                if (deadEnds.contains(poll)) continue;

                String cur = new String(poll);

                for (int i = 0; i < 4; i++) {
                    char c = cur.charAt(i);
                    String next = cur.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + cur.substring(i + 1);
                    String pre = cur.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + cur.substring(i + 1);

                    if (!visited.contains(pre) && !deadEnds.contains(pre)) {
                        queue.offer(pre);
                        visited.add(pre);
                    }
                    if (!visited.contains(next) && !deadEnds.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
            level++;

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(openLock(new String[]{"0000"},
                "8888"));
    }
}
