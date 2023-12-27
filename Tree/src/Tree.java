public class Tree {
    Node<Integer> root;

    Tree(){ root = null; }

    public void add(Integer value){
        addFunction(root, value);
    }

    public void preorder(){
        System.out.println("PREORDER:- ");
        preorderFunction(this.root);
    }

    public void inorder(){
        System.out.println("INORDER:- ");
        inorderFunction(this.root);
    }

    public void postorder(){
        System.out.println("POSTORDER:- ");
        postorderFunction(this.root);
    }

    private void addFunction(Node<Integer> current, Integer insertValue){
        if(this.root == null){ this.root = new Node<Integer>(insertValue); return; }

        if(current.value > insertValue){
            if(current.left == null){ current.left = new Node<Integer>(insertValue); return; }
            else addFunction(current.left, insertValue);
        }
        else{
            if(current.right == null){ current.right = new Node<Integer>(insertValue); return; }
            else addFunction(current.right, insertValue);
        }
    }

    private void preorderFunction(Node<Integer> root){
        if(root == null) return;

        System.out.print(root.value + " ");
        preorderFunction(root.left);
        preorderFunction(root.right);
    }

    private void inorderFunction(Node<Integer> root){
        if(root == null) return;
        
        inorderFunction(root.left);
        System.out.print(root.value + " ");
        inorderFunction(root.right);
    }

    private void postorderFunction(Node<Integer> root){
        if(root == null) return;
        
        postorderFunction(root.left);
        postorderFunction(root.right);
        System.out.print(root.value + " ");
    }
}
