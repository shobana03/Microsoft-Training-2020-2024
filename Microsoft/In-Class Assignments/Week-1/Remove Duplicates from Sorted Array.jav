class Solution {
    public int removeDuplicates(int[] nums) {
        int k=nums.length;
        int count=1;
        for(int i=1;i<k;i++){
            if(nums[i-1]<nums[i]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
        
    }
}
