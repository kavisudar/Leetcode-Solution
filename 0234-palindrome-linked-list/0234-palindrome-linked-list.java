/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb=new StringBuilder();
        StringBuilder st=new StringBuilder();
        while(head!=null)
        {
            sb.append(head.val);
            head=head.next;
        }
        st.append(sb);
        sb.reverse();
        return st.toString().equals(sb.toString());
    }
}