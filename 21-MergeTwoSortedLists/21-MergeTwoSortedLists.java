            curr.next = list1;
            list1 = list1.next;
        }
        while(list2 != null){
            curr.next = list2;
            list2=list2.next;
            curr=curr.next;
        }
        return head.next;
            curr=curr.next;
[
