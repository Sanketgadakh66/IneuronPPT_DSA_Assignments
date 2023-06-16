import java.util.Arrays;

public class Q6_DuplicateNumber {
    public static boolean DuplicateNumber(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true; 
            }
        }
        
        return false; 
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean result = DuplicateNumber(nums);
        System.out.println("Result: " + result);
    }
}
