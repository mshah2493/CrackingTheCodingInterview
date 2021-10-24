package treesandgraphs;

import java.util.ArrayList;
import java.util.List;

import datastructure.TreeNode;

public class ListOfDepths {
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, "", list);   
        return list;
    }
    
    private void dfs(TreeNode root, String str, List<String> list) {
        if (root == null) return;
               
        str += String.valueOf(root.val);
        if (root.left == null && root.right == null) {
            list.add(str.toString());
        } else {
            str += "->";
            dfs(root.left, str, list);
            dfs(root.right, str, list);
        }
    }
}
