/**
 * Created by vkarunakaran on 12/31/15.
 */
public class TreeReconstructionInorderPreorder {
    static int preindex = 0;

    public TreeNode buildTree(int[] inarr, int[] prearr, int instart, int inend) {
        if (instart > inend) {
            preindex--;
            return null;
        }
        int rootData = prearr[preindex];
        int inindex = findInorderIndex(inarr, instart, inend, rootData);
        TreeNode root = new TreeNode();
        root.data = rootData;
        preindex++;
        root.left = buildTree(inarr, prearr, instart, inindex - 1);
        preindex++;
        root.right = buildTree(inarr, prearr, inindex + 1, inend);
        return root;
    }

    public int findInorderIndex(int[] inarr, int start, int end, int data) {
        for (int i = start; i <= end; i++) {
            if (inarr[i] == data) return i;
        }
        return -1;
    }

}

class TreeNode {
    int data;
    TreeNode left, right;
}
