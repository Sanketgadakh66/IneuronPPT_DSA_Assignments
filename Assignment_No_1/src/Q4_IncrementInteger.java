import java.util.Arrays;

public class Q4_IncrementInteger {
    public static int[] IncrementInteger(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increment the digit
                return digits; // No need to continue, return the result
            }
            
            digits[i] = 0; // Set the digit to 0 if it becomes 10
        }
        
        // If we reach this point, it means all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1; // Add an additional digit at the beginning
        return result;
    }
    
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = IncrementInteger(digits);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
