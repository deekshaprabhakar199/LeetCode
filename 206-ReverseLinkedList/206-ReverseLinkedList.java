            curr.next = prev.next;
            prev.next = curr;
            curr= temp.next;
        }
        return prev.next;
    }
}
[
