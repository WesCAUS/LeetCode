class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] dummy = nums.clone();
        int N = nums.length;
        Arrays.sort(nums); // sort nums so that numbers increase from 
                          // 'right' to 'left' to be used below
        int left = 0; int right = N - 1;

        while (nums[left]+nums[right]!=target)
        {
            if(nums[left]+nums[right]>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            if(dummy[i] == nums[left])
            {
                result[0] = i;
            }
        }

        for(int j = N -1; j >= 0; j--)
        {
            if(dummy[j] == nums[right])
            {
                result[1] = j;
            }
        }

        return result;
    }
}
