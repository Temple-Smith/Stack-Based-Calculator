package BST;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(String key, int value) {
        root = insertRecursion(root, key, value);
    }

    Node insertRecursion(Node root, String key, int value) {
        //if the root is null, create a new root node with the key
        if (root == null) {
            root = new Node(key, value);
            return root;
        }
        //if the key is less than the root, move it to the left as a leaf
        if (key.compareTo(root.key) < 0) {
            root.left = insertRecursion(root.left, key, value);
        }
        else if (key.compareTo(root.key) > 0) {
            root.right = insertRecursion(root.right, key, value);
        }
        return root;
    }

    public int search(String key) {
        Node current = root;

        while (current != null) {
            if (key.equals(current.key)) {
                return current.value;
            }
            else if (key.compareTo(current.key) < 0) {
                current = current.left;
            }
            else {
                current = current.right;
            }
        }

        throw new NullPointerException("Key not found.");
    }

    public Node delete(String key) {
        root = deleteRec(root, key);
        return root;
    }

    //We recursively iterate through our BST
    //until we locate the value we need to delete, or null.

    public Node deleteRec(Node root, String key) {
        // edge case: return null if the tree is empty.
        if (root == null) return root;
        // We need to update the pointer of the parent
        // check if value is in the left subtree
        if (key.compareTo(root.key) < 0) {
            // Recurse into the left subtree
            // and update root.left with the subtree after deletion O(h) - height of tree
            // h = log n (balanced) OR h = n (skewed)
            root.left = deleteRec(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            //update the pointer on the right subtree
            root.right = deleteRec(root.right, key);
        } else {
            //We found the node!
            //Case 1: node has no children.
            if (root.left == null && root.right == null) {
                return null;
            }
            //Case 2: node has a single child.
            //Check left and right: If left node is empty
            //return the right of the node.
            else if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            //Case 3: 2 children (Find min of right, OR max of left)
            else {
                //We find the minimum of the right subtree
                Node successor = findMin(root.right);
                // copy the value from the successor into the root value
                root.key = successor.key;
                // then we delete the duplicate value
                root.right = deleteRec(root.right, successor.key);
            }
        }
        return root;
    }

    Node findMin(Node node) {
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }

    //We make the root null. All children will be deallocated with Java's garbage collection.
    public void deleteAll() {
        root = null;
    }

    //The sample runs display an alphabetically sorted tree that is always skewed to the right.
    public StringBuilder displayTree(Node node, int depth) {
        StringBuilder sb = new StringBuilder();
        if (node == null) {
            return sb;
        }

        //recursively display nodes to the right.
        sb.append(displayTree(node.right, depth + 1));

        //loop for indentation
        for (int i = 0; i < depth; i++) {
            sb.append("    "); //per level
        }

        // For this node's data.
        sb.append("||==> ")
                .append(node.key)
                .append(":")
                .append(node.value)
                .append("\n");

        //Recursively print
        sb.append(displayTree(node.left, depth + 1));
        return sb;
    }

}
