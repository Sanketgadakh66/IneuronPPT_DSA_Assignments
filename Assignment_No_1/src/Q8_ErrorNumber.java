import java.util.Arrays;

public class Q8_ErrorNumber {
    public static int[] ErrorNumber(int[] nums) {
        int[] counts = new int[nums.length + 1]; 
        
        for (int num : nums) {
            counts[num]++; 
        }
        
        int duplicate = 0;
        int missNo = 0;
        
        for (int i = 1; i <= nums.length; i++) {
            if (counts[i] == 2) {
                duplicate = i; 
            }
            if (counts[i] == 0) {
                missNo = i; 
            }
        }
        
        return new int[]{duplicate, missNo};
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = ErrorNumber(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
