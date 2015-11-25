# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def postorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if root == None: return []
        stack = []
        res = []
        lastVisit = None
        while root or stack:
            if root:
                stack.append(root)
                root = root.left
            else:
                peak = stack[-1]
                if peak.right and peak.right != lastVisit:
                    root = peak.right
                else:
                    lastVisit = stack.pop()
                    res.append(lastVisit.val)
        return res
