class solution {
    TreeNode first = null,second=null,prev=null;
    public void recoverTree(TreeNode root) {
        inOrder(root);
        int temp = first.val;
        first.val = second.val;;
        second.val = temp;
    }

    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }else{
            inOrder(root.left);
            if(prev!=null && root.val<prev.val){
                if(first==null){
                    first=prev;
                }
                second=root;
            }
            prev = root;
            inOrder(root.right);
        }
    }
}