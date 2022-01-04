package DataStructures.Tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(12);
        tree.add(15);
        tree.add(21);
        tree.add(25);
        tree.add(37);
        tree.add(19);
        tree.add(20);
        tree.add(6);
        tree.add(11);
        tree.add(8);
        tree.add(9);
        tree.add(7);
        tree.add(3);
        tree.add(5);
        System.out.println("leaves = " + tree.getSize());
        tree.traverseInOrder();
        System.out.println(" ");
        tree.traversePostOrder();
        System.out.println(" ");
        tree.traversePreOrder();

        // Output
        // leaves = 14
        // 3 5 6 7 8 9 11 12 15 19 20 21 25 37
        // 5 3 7 9 8 11 6 20 19 37 25 21 15 12
        // 12 6 3 5 11 8 7 9 15 21 19 20 25 37
    }
}
