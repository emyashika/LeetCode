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
        HashSet<ListNode> s=new HashSet<>();
        if(head==null){
            return false;
        }
        ListNode temp=head;
        while(temp.next!=null){
            if(s.contains(temp)){
                return true;
            }
            s.add(temp);
            temp=temp.next;
        }
        return false;
    }
}