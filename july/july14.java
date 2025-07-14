import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class july14 {
     public int getDecimalValue(ListNode head) {
        List<Integer> ls = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            ls.add(node.val);
            node = node.next;
        }
        Collections.reverse(ls);
        int v=0;
        for (int i = ls.size() - 1; i >= 0; i--) {
            v += ls.get(i)*(Math.pow(2,i));
        }
        return v;
    }
}
