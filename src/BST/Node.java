package BST;

public class Node {
    String key;
    int value;
    Node left, right;

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
        //left and right of the constructed node should be null.
        left = right = null;
    }

}

