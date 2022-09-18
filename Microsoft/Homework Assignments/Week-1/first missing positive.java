public class Solution {
public int firstMissingPositive(int[] nums) {
    if(nums.length==0)
        return 1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]<0){
            nums[i]=0;
        }
    }
    int currVal = 0;
    for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=nums.length+1;
                continue;
            }
            currVal = nums[i];
            if(currVal<0)
                currVal = currVal*(-1);
            if(currVal > nums.length)
                continue;
            if( nums[currVal-1]>0){
                nums[currVal-1] = nums[currVal-1]*(-1);
            }
            else if(nums[currVal-1] == 0)
                nums[currVal-1] = (nums.length+1)*(-1);
    }
    int num=0;
    for(num=0;num<nums.length;num++){
        if(nums[num]>=0){
            break;
        }
    }
    return num+1;
}   
}
