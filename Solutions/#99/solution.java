class solution {
    TreeNode first = null,second=null,prev=null;
    public void recoverTree(TreeNode root) {
        inOrder(root);
        int temp = first.val;
        first.val = second.val;;
        second.val = temp;
    }//recoverTree

    public void inOrder(TreeNode root){
        if(root==null) return;
        else{
            inOrder(root.left);
            if(prev!=null && root.val<prev.val){
                if(first==null){
                    first=prev;
                }//if
                second=root;
            }//outer-if
            prev = root;
            inOrder(root.right);
        }//else
    }//inOrder()
}//class