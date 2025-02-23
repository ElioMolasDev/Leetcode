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
class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return buildTree(preorder, postorder, 0, preorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] postorder, int preStart, int preEnd, int postStart, int postEnd) {
        if (preStart > preEnd) {
            return null;
        }
        
        // La raíz es el primer elemento en preorden
        TreeNode root = new TreeNode(preorder[preStart]);
        
        if (preStart == preEnd) {
            return root;
        }
        
        // Encontrar el índice del siguiente elemento en preorden en postorden
        int index = postStart;
        while (postorder[index] != preorder[preStart + 1]) {
            index++;
        }
        
        // Calcular el tamaño del subárbol izquierdo
        int leftSubtreeSize = index - postStart + 1;
        
        // Construir el subárbol izquierdo
        root.left = buildTree(preorder, postorder, preStart + 1, preStart + leftSubtreeSize, postStart, index);
        
        // Construir el subárbol derecho
        root.right = buildTree(preorder, postorder, preStart + leftSubtreeSize + 1, preEnd, index + 1, postEnd - 1);
        
        return root;
    }
}