/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp1=head;
        ListNode temp2=head;
        while(temp1!=null&&temp1.next!=null)
        {
            temp1=temp1.next.next;
            temp2=temp2.next;
            if(temp2==temp1)
            {
                return true;
            }
        }
        return false;
    }
}