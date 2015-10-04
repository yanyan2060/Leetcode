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
        stack, res = [], []
        stack.append(root)
        prev = None
        while stack:
            cur = stack[len(stack) - 1]
            if (cur.left == None and cur.right == None) or (prev and (prev == cur.left or prev == cur.right)):
                res.append(cur.val)
                stack.pop()
                prev = cur
            else:
                if cur.right: stack.append(cur.right)
                if cur.left: stack.append(cur.left)
        return res
