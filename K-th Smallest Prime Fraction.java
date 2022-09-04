class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       
        int i=0;int j=0;int pro=1;
        int count=0;
        while(i<nums.length && j<nums.length)
        {
           
            if(pro*nums[j]<k)
            {
                System.out.println(j);
                 pro=pro*nums[j];
                count+=j-i+1;
                j++;
            }
            else 
            {
                if(nums[i]<k)
                pro/=nums[i];
                
                i++;
                if(j<i)
                {
                    j=i;
                }
            }
        }
        return count;
    }
}
