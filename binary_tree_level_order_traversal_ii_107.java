public ArrayList<ArrayList<Integer>> levelOrderBottom(Treenode root){
  ArrayList<ArrayList<Integer>> result=new ArrayList<>();
  if(root==null) return result;
  Queue<TreeNode> queue=new Linkedlist<TreeNode>();
  queue.offer(root);
  while(!queue.isEmpty()){
    int size=queue.size();
    ArrayList<Integer> level= new ArrayList<>();
    for(int i=0;i<size;i++){
      TreeNode head=queue.poll();
      level.add(head.val);
      if(head.left!=null){
        queue.offer(head.left);
      }
      if(head.right!=null){
        queue.offer(head.right);
      }
    }
    result.add(level);
  }
  Collections.reverse(result);
  return result;
}
