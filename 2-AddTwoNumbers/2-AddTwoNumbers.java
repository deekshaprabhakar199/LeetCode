            }
            l2=l2.next;
            // dummy=dummy.next;
        }

        //carry>0 add extra digit for carry
        if(l1 ==null && l2 == null && carry >0){
            dummy.next=new ListNode(0);
            dummy=dummy.next;
            dummy.val=carry;
            dummy.next=null;
        }
        // else{
        //     //dummy=null;
        // }
        return head1;
    }
}
[
