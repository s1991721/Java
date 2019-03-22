import solution.MyCircularQueue;

public class Main {

    public static void main(String[] args) {
        MyCircularQueue queue=new MyCircularQueue(3);
        System.out.println(queue.enQueue(1));
        System.out.println(queue.enQueue(2));
        System.out.println(queue.enQueue(3));
        System.out.println(queue.enQueue(4));
        System.out.println(queue.Rear());

    }
}
