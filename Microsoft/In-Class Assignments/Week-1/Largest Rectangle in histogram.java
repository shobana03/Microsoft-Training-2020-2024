class Rectangle {
    int height;
    int start;
    
    public Rectangle(int h, int s) {
        height = h;
        start = s;
    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 1)
            return heights[0];
        
        Stack<Rectangle> stack = new Stack();
        int maxArea = 0;
        int end = 0;
        while (end < n) {
            int start = end;
            while (!stack.isEmpty() && stack.peek().height > heights[end]) {
                Rectangle rec = stack.pop();
                int width = end - rec.start;
                int area = width * rec.height;
                maxArea = Math.max(maxArea, area);
                start = rec.start;
            }
            stack.push(new Rectangle(heights[end], start));
            end++;
        }
        while (!stack.isEmpty()) {
            Rectangle rec = stack.pop();
            int width = end - rec.start;
            int area = rec.height * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
