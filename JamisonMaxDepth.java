class JamisonMaxDepth {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }

    int leftNode = maxDepth(root.left) + 1;
    int rightNode = maxDepth(root.right) + 1;

    return max(leftNode, rightNode);
  }
}