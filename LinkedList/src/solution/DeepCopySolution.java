package solution;

import java.util.HashMap;

/**
 * Created by mr.lin on 2018/8/13.
 * <p>
 * Copy List with Random Pointer
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1229/
 */
public class DeepCopySolution {

    public String solution(String input) {
        return "";
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        HashMap<RandomListNode, RandomListNode> hashMap = new HashMap<RandomListNode, RandomListNode>();

        RandomListNode node = head;
        while (node != null) {//旧节点做key
            hashMap.put(node, new RandomListNode(node.label));
            node = node.next;
        }

        node = head;
        while (node != null) {//复制随机指针
            hashMap.get(node).next = hashMap.get(node.next);

            hashMap.get(node).random = hashMap.get(node.random);

            node = node.next;
        }

        return hashMap.get(head);

    }


    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }

}
