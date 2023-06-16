import java.util.Arrays;

public class Q1_ClosestTwoSum {
	public static int[] twoSum(int[]nums, int target) {
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length;j++) {
				int remain= target-nums[i];
				
				if(nums[j]==remain) {
					return new int[]{i,j};
				}
			}
		}
		throw new IllegalArgumentException("no match found");
	}
	public static void main(String[] args) {
        int[] nums = {2,7,1,15};
        int target = 9;
        int[] twoSum = twoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));
    }
}
