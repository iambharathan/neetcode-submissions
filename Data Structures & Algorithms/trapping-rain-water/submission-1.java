class Solution {
    public int trap(int[] height) {
        int left =0 ;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trap = 0;

        while(left < right){
            if(height[left] < height[right]){
                 if(height[left] >= leftMax){
                leftMax = height[left];
            }
            else{
                trap += leftMax - height[left];
                
            }
            left ++;
            }
            else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }
                else{
                    trap += rightMax - height[right];
                    
                }
                right--;
            }
        }
        return trap;

    }
}
