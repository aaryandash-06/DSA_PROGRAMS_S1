//You are given an array of integers (array name is nums) and an integer target,
//return indices of the two numbers such that they add up to target.
import java.util.*;
public class Problem_9 {
    
    static int[] twoSum(int[] nums, int target){
        int left = 0; 
        int right = nums.length - 1;

        while(left < right){
            int sum = nums[left] + nums[right];

            if(sum == target){
                return new int[]{left , right};
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
       int[] nums = {2,7,9,11,13};
       int target = 9;
       int[] result = twoSum(nums, target);
       System.out.println(Arrays.toString(result));
    }
}
