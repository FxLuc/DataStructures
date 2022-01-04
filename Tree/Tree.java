package DataStructures.Tree;

public class Tree {
    private Node root;
    private int size;

    public Tree() {
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void add(int data) {
        this.root = addRecursive(this.root, data);
        if (this.root != null) size++;
    }

    private Node addRecursive(Node currNode, int data) {
        if (currNode == null) return new Node(data);
        if (data < currNode.getData())
            currNode.setLeft(addRecursive(currNode.getLeft(), data));
        else if (data > currNode.getData())
            currNode.setRight(addRecursive(currNode.getRight(), data));
        else { 
            System.out.println("Error: Value " + data + " is already exists!");
            return null;
        }
        return currNode;
    }

    public void delete(int data) { 
        this.root = deleteRecursive(this.root, data);
        this.size--;
    }
   
    private Node deleteRecursive(Node currNode, int data)  { 
        if (currNode == null) {
            this.size++; //offset delete() failed
            return currNode;
        } 
        if (data < currNode.getData())
            currNode.setLeft(deleteRecursive(currNode.getLeft(), data));
        else if (data > currNode.getData())
            currNode.setRight(deleteRecursive(currNode.getRight(), data)); 
        else  { 
            if (currNode.getLeft() == null) 
                return currNode.getRight(); 
            else if (currNode.getRight() == null) 
                return currNode.getLeft(); 
            currNode.setData(minValue(currNode.getRight())); 
            currNode.setRight(deleteRecursive(currNode.getRight(), currNode.getData())); 
        } 
        return currNode; 
    } 
   
    private int minValue(Node currNode) {
        int minVal = currNode.getData(); 
        while (currNode.getLeft() != null)  { 
            minVal = currNode.getLeft().getData();
            currNode = currNode.getLeft(); 
        } 
        return minVal; 
    }

    public boolean search(int data)  { 
        Node currNode = search_Recursive(this.root, data); 
        return currNode != null;
    }

    private Node search_Recursive(Node currNode, int data)  {
        if (currNode == null || currNode.getData() == data) 
            return currNode;
        if (currNode.getData() > data) 
            return search_Recursive(currNode.getLeft(), data); 
        return search_Recursive(currNode.getRight(), data); 
    } 

    public void traverseInOrder() {
        traverseInOrderRecursive(this.root);
    }

    public void traversePreOrder() {
        traversePreOrderRecursive(this.root);
    }

    public void traversePostOrder() {
        traversePostOrderRecursive(this.root);
    }

    private void traverseInOrderRecursive(Node currNode) {
        if (currNode != null) {
            traverseInOrderRecursive(currNode.getLeft());
            System.out.print(currNode.getData() + " ");
            traverseInOrderRecursive(currNode.getRight());
        }
    }

    private void traversePreOrderRecursive(Node currNode) {
        if (currNode != null) {
            System.out.print(currNode.getData() + " ");
            traversePreOrderRecursive(currNode.getLeft());
            traversePreOrderRecursive(currNode.getRight());
        }
    }

    private void traversePostOrderRecursive(Node currNode) {
        if (currNode != null) {
            traversePostOrderRecursive(currNode.getLeft());
            traversePostOrderRecursive(currNode.getRight());
            System.out.print(currNode.getData() + " ");
        }
    }
}
