public class Tree {
    Node<Integer> root;

    Tree(){}

    public void add(Integer value){
        insert(root, value);
    }

    private void insert(Node<Integer> root, Integer insertValue){
        if(root == null){ root = new Node<Integer>(insertValue); return; }

        if(root.value > insertValue){
            if(root.left == null){ root.left = new Node<Integer>(insertValue); return; }
            else insert(root.left, insertValue);
        }
        else{
            if(root.right == null){ root.right = new Node<Integer>(insertValue); return; }
            else insert(root.right, insertValue);
        }
    }
}
