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
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> map=new HashMap<>();
            if(head==null){
            return head;
        }
        ListNode temp=head;
        int i=0;
        while(temp.next!=null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp,i);
            temp=temp.next;
        }
        return null;
    }
}