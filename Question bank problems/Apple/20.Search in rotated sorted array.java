class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int left = nums[start];
            int right = nums[end];
            if(left == target){
                return start;
            }
            if(right == target){
                return end;
            }
            start++;
            end--;
        }
        return -1;
    }
}
