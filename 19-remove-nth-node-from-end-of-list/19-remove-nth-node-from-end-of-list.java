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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count=count-n;
        if(count==0){
            return head.next;
        }
        temp=head;
        ListNode prev=head;
        while(count>0){
            prev=temp;
            temp=temp.next;
            count--;
        }
        prev.next=temp.next;
        return head;
    }
}