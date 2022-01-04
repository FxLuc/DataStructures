package DataStructures.Tree;

public class Node {
    private int data;
    private Node left;
    private Node right;
    
    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node data(int data) {
        setData(data);
        return this;
    }

    public Node left(Node left) {
        setLeft(left);
        return this;
    }

    public Node right(Node right) {
        setRight(right);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " data='" + getData() + "'" +
            ", left='" + getLeft() + "'" +
            ", right='" + getRight() + "'" +
            "}";
    }
}
