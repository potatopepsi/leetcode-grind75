import java.util.Arrays;
import java.util.Stack;

public class weekone_one {
    public static int[] twoSums(int [] nums, int target){
        int length = nums.length;

        int exist = 0;

        Stack<Integer> arrayStack = new Stack<>();

        /* Converting Array to Stack */
        for(int i = 0; i < length; i++){
            arrayStack.push(nums[i]);
        }

        /* Stack lookup would be faster than using brute force of two arrays */
        for(int i = 0; i < length; i++){
            exist = target - nums[i];
            exist = arrayStack.search(exist);

            
            if(exist != -1 && (length-exist)!=i){
                int[] result = {i, length-exist};
                return result;
            }
        }
        
        /* Worst Case - There's no solution and the method just returns the original array */
        return nums;
    }
    public static void main(String[] args){

        /* Test Cases */
        
        int[] nums = new int[] {3,2,4};
        int target = 6;

        int[] result = twoSums(nums, target);

        System.out.println(Arrays.toString(result));

        // int[] nums = new int[] {5,2,4};
        // int target = 6;
        // int[] result = twoSums(nums, target);

        // System.out.println(Arrays.toString(result));

    }
}