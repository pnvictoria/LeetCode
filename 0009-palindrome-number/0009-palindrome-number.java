class Solution {
    public boolean isPalindrome(int x) {
        String newX = Integer.toString(x);
        String reverseX = new StringBuffer(newX).reverse().toString();
        if(newX.equals(reverseX)) {
            return true;
        }
        return false;
    }
}