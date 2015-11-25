# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: List[List[int]]
        """
        
        if root == None: return []
        res = []
        self.dfs(root, sum, [root.val], res)
        return res
    def dfs(self, root, target, path, res):
        if root == None: return []
        if root.left == None and root.right == None and root.val == target:
            res.append(path)
        if root.left:
            self.dfs(root.left, target-root.val, path + [root.left.val], res)
        if root.right:
            self.dfs(root.right, target-root.val, path + [root.right.val], res)
        
