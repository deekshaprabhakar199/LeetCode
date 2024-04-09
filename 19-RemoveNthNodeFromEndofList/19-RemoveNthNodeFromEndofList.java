        }

        //move/resize window
        while(right != null){
            right=right.next;
            rp++;
            //while(rp-lp>n){
                left=left.next;
                lp++;
            //}
        }
        //remove lp or left node
        while(cp<lp-1){
            curr=curr.next;
            cp++;
        }
        curr.next=left.next;

        return head;
    }
}
[
