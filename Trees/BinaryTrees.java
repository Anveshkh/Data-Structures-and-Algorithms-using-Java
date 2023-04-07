package Trees;

public class BinaryTrees {
    static class Node{
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data){
            this.data = data;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public Node BuildTree(int[] nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.leftChild = BuildTree(nodes);
            newNode.rightChild = BuildTree(nodes);

            return newNode;
        }

        public void preorderTraversal(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorderTraversal(root.leftChild);
            preorderTraversal(root.rightChild);
        }

        public void inorderTraversal(Node root){
            if(root == null){
                return ;
            }
            inorderTraversal(root.leftChild);
            System.out.print(root.data + " ");
            inorderTraversal(root.rightChild);
        }

        public void postorderTraversal(Node root){
            if(root == null){
                return;
            }
            postorderTraversal(root.leftChild);
            postorderTraversal(root.rightChild);
            System.out.print(root.data + " ");
        }

        public int countNodes(Node root){
            if(root == null){
                return 0;
            }
            int lc = countNodes(root.leftChild);
            int rc = countNodes(root.rightChild);
            return lc + rc + 1;
        }

        public int sumNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = sumNodes(root.leftChild);
            int rightSum = sumNodes(root.rightChild);
            return leftSum + rightSum + root.data;
        }

        public int height(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = height(root.leftChild);
            int rightHeight = height(root.rightChild);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(root.data);
        System.out.println("Preorder Traversal: - ");
        tree.preorderTraversal(root);
        System.out.println();
        System.out.println("Inorder Traversal: - ");
        tree.inorderTraversal(root);
        System.out.println();
        System.out.println("Postorder Traversal: - ");
        tree.postorderTraversal(root);
        System.out.println();
        System.out.println("Total number of nodes :- " + tree.countNodes(root));
        System.out.println("Sum of Nodes is :- ");
        System.out.println(tree.sumNodes(root));
        System.out.println("Height of tree is :- " + tree.height(root));
    }

}
