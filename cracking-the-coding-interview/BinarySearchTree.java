/**
 * Created by ytw on 10/4/16.
 */
public class BinarySearchTree {
    TreeNode root;

    BinarySearchTree(int[] data) {
        createBalancedBinarySearchTree(data);
    }

    static TreeNode createBalancedBinarySearchTree(int[] data) {
        return createBST(data, 0, data.length - 1);
    }

    static TreeNode createBST(int[] dataArray, int start, int end) {
        if (start > end) {
            return null;
        }
        TreeNode n = new TreeNode();
        int midpoint = (start + end) / 2;
        n.data = dataArray[midpoint];
        n.left = createBST(dataArray, start, midpoint - 1);
        n.right = createBST(dataArray, midpoint + 1, end);
        return n;
    }



    private String getData(TreeNode node){
        return "";
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        return "";
    }
}


