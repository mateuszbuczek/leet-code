public class SameTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    // recursion
//    static boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p == null && q == null) return true;
//        if(q == null || p == null) return false;
//        if(p.val != q.val) return false;
//        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
//    }
}
