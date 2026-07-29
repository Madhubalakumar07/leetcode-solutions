class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        x_str = str(x)
        k = len(x_str) // 2  # Use integer division

        for i in range(k):
            if x_str[i] != x_str[-(i + 1)]:  # Compare from both ends
                return False
        else:
            return True