        int min = Math.min(p.val,q.val);
        if(max<root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(min> root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        else{
            return root;
        }
    }
}
[
