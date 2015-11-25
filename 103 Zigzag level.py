# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def zigzagLevelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if root == None: return []
        curlevel = [root]
        i = -1
        res = []
        while curlevel:
            nextlevel = []
            number = []
            i += 1
            for node in curlevel:
                number.append(node.val)
                if node.left:
                    nextlevel.append(node.left)
                if node.right:
                    nextlevel.append(node.right)
            if i  %2 == 1:
                number.reverse()
            res.append(number)
            curlevel = nextlevel
        return res
