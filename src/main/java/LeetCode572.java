public class LeetCode572 {
    //https://leetcode.com/problems/subtree-of-another-tree/
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root ==null && subRoot!=null){
            return false;
        }else if(isSameTree(root,subRoot)){
            return true;
        }else{
            return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        }
    }

    private boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

