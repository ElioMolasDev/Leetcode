/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
    private HashSet<Integer> recoveredValues = new HashSet<>();

    public FindElements(TreeNode root) {
         recover(root, 0);
    }

    private void recover(TreeNode node, int value) {
        if (node == null) {
            return;
        }
        node.val = value;  
        recoveredValues.add(value);  

        if (node.left != null) {
            recover(node.left, 2 * value + 1);  // Valor del hijo izquierdo
        }
        if (node.right != null) {
            recover(node.right, 2 * value + 2);  
        }
    }
    
    public boolean find(int target) {
        return recoveredValues.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */