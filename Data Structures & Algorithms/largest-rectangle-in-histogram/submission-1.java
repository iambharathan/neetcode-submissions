class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= heights.length ; i++){
            int h = (i == heights.length) ? 0: heights[i];

            while(!stack.isEmpty() && h < heights[stack.peek()]){
                int right = i;
                int height = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = right - left -1;
                int area = width *height;
                maxArea = Math.max(maxArea , area);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
