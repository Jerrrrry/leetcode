//Bottom up approach:
public TreeNode UpsideDownBinaryTree(TreeNode root) {
   return dfsBottomUp(root, null);
}
private TreeNode dfsBottomUp(TreeNode p, TreeNode parent) {
   if (p == null) return parent;
   TreeNode root = dfsBottomUp(p.left, p);
   p.left = (parent == null) ? parent : parent.right;
   p.right = parent;
   return root;
}


//Top down approach
public TreeNode UpsideDownBinaryTree(TreeNode root) {
   TreeNode p = root, parent = null, parentRight = null;
   while (p != null) {
      TreeNode left = p.left;
      p.left = parentRight;
      parentRight = p.right;
      p.right = parent;
      parent = p;
      p = left;
   }
   return parent;
}