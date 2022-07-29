public class LeetCode35 {
    //https://leetcode.com/problems/search-insert-position/
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;

        if(target < nums[i] || target== nums[i]) return i;
        if(target > nums[j]) return j+1;
        if(target == nums[j]) return j;

        int mid= (i+j)/2;

        while(i<=j){
            if(nums[mid]==target){
                return mid;
            }else if(target > nums[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
            mid=(i+j)/2;
        }
    return mid+1;

    }

}
