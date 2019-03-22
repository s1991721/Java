import solution.NumberOFIslandsSolution;

public class Main {

    public static void main(String[] args) {

//        MyCircularQueue queue = new MyCircularQueue(3);
//        System.out.println(queue.enQueue(1));
//        System.out.println(queue.enQueue(2));
//        System.out.println(queue.enQueue(3));
//        System.out.println(queue.enQueue(4));
//        System.out.println(queue.Rear());

//        new char[][]{
//                {'1', '1', '0', '0', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '1', '0', '0'},
//                {'0', '0', '0', '1', '1'},
//        }
        NumberOFIslandsSolution numberOFIslandsSolution = new NumberOFIslandsSolution();
        int result = numberOFIslandsSolution.numIslands(new char[][]{{'1'}, {'1'}});

        System.out.println("" + result);


    }

}
