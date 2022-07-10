package MonthlyChallenge2022.June;

import LinkedList.ListNode;

import java.util.ArrayList;

public class Intersection_of_Two_Linked_Lists_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA.val == headB.val && headA.next == headB.next) return headA;
        ListNode f = headA, s = headB;
        ArrayList<ListNode> listA = new ArrayList<>(), listB = new ArrayList<>();
        while (f != s) {
            if (f != null)
                listA.add(f);
            if (s != null)
                listA.add(s);
            if (listA.contains(s)) return s;
            if (listB.contains(f)) return f;
            if (f != null) f = f.next;
            if (s != null) s = s.next;
            if (f == null && s == null) break;
        }

        return null;
    }
}
