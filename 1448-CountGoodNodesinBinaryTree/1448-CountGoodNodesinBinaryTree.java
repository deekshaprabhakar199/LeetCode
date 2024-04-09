        int curr=0;
        if(root.val >= max){
            curr= 1;
            max = root.val;
        }
        int left = checkGood(root.left, max);
        int right = checkGood(root.right, max);
        return curr+left+right;
    }
}
[
