public class App {
    public static void main(String[] args) throws Exception {
        Tree BST = new Tree();
        BST.add(56);
        BST.add(30);
        BST.add(70);

        BST.inorder();
        System.out.println("SIZE: " + BST.size());
    }
}
