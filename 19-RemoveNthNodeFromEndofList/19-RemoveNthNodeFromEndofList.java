            left= left.next;
            lp++;
        }
        while(cp < lp-1){
            curr=curr.next;
            cp++;
        }
        curr.next = left.next;
        return head;
    }
}
[
