class Solution {
    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        String rev =  "";

        for (int i = temp.length() -1; i >= 0; i-- ){
            rev = rev + temp.charAt(i);
        }

        if(temp.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
}