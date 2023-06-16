import java.util.Arrays;

public class Q7_ZeroesProblem {
    public static void ZeroesProblem(int[] nums) {
        int left = 0; 
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }
        
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        ZeroesProblem(nums);
        System.out.println("Result: " + Arrays.toString(nums));
    }
}
