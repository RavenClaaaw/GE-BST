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

    public boolean find(Integer value){
        return findFunction(this.root, value);
    }

    public int size(){
        return sizeFunction(this.root);
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

    private void preorderFunction(Node<Integer> current){
        if(current == null) return;

        System.out.print(current.value + " ");
        preorderFunction(current.left);
        preorderFunction(current.right);
    }

    private void inorderFunction(Node<Integer> current){
        if(current == null) return;
        
        inorderFunction(current.left);
        System.out.print(current.value + " ");
        inorderFunction(current.right);
    }

    private void postorderFunction(Node<Integer> current){
        if(current == null) return;
        
        postorderFunction(current.left);
        postorderFunction(current.right);
        System.out.print(current.value + " ");
    }

    private int sizeFunction(Node<Integer> current){
        if(current == null) return 0;
        
        return sizeFunction(current.left) + sizeFunction(current.right) + 1;
    }

    private boolean findFunction(Node<Integer> current, Integer findValue){
        if(this.root == null){ return false; }
        if(current.value == findValue) return true;

        if(current.value > findValue){
            if(findFunction(current.left, findValue)) return true;
        }
        else{
            if(findFunction(current.right, findValue)) return true;
        }

        return false;
    }
}
