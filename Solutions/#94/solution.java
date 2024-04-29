import java.util.LinkedList;
class solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        helper(root,list);
        return list;
    }//inOrderTraversal

    public void helper(TreeNode root,List l){
        if(root!=null){
            helper(root.left,l);
            l.add(root.val);
            helper(root.right,l);
        }
        
    }
}