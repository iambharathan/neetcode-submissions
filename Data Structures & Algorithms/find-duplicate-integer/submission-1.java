class Solution {
    public int findDuplicate(int[] nums) {
       int slow = nums[0];
       int fast = nums[0];

       //find the duplicate meeting point 
       do{
        slow = nums[slow];
        fast = nums[nums[fast]];
       }while(slow != fast);

        slow = nums[0];
       //find the cycle enterance
       while(slow != fast){
        slow = nums[slow];
        fast = nums[fast];
       }

       return slow;
    }
}
