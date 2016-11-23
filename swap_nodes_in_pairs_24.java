public ListNode swapPairs(ListNode head){
  ListNode original=new ListNode(0);
  original.next=head;
  head=original;
  //
  while(head.next!=null&&head.next.next!=null){
    ListNode n1=head.next,n2=head.next.next;

    head.next=n2;
    n1.next=n2.next;
    n2.next=n1;

    head=n1;
  }
  return original.next;
}
