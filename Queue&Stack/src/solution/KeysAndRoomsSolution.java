package solution;

import java.util.*;

public class KeysAndRoomsSolution {

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        Queue<Integer> queue = new LinkedList<Integer>();
        Set<Integer> visited = new HashSet<Integer>();

        for (int i = 0; i < rooms.get(0).size(); i++) {
            queue.offer(rooms.get(0).get(i));
        }
        visited.add(0);

        while (!queue.isEmpty()) {

            int room = queue.poll();
            visited.add(room);
            List<Integer> keys = rooms.get(room);
            for (int i = 0; i < keys.size(); i++) {
                if (!visited.contains(keys.get(i))) {
                    queue.offer(keys.get(i));
                }
            }

        }

        return visited.size() == rooms.size();
    }

    public static void main(String[] args) {
        List rooms = new ArrayList<List<Integer>>();

        List<Integer> keys = new ArrayList();
        keys.add(1);
        keys.add(3);
        rooms.add(keys);

        keys = new ArrayList();
        keys.add(3);
        keys.add(0);
        keys.add(1);
        rooms.add(keys);

        keys = new ArrayList();
        keys.add(2);
        rooms.add(keys);

        keys = new ArrayList();
        keys.add(0);
        rooms.add(keys);

        System.out.println(canVisitAllRooms(rooms));
    }

}
