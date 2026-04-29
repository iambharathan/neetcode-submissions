class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left<right){
            //To remove the blank spaces
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                    left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            //To check for non palindrome condtion 
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            right--;
            left++;
        }
        return true;
    }
}
