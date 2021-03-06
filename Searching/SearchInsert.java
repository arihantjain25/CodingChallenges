import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *LeetCodeProblems
 *Find the index of the value that equates the target or find the index where the value would be inserted.
 *
 *@author Arihant Jain
 */

public class SearchInsert {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int target = Integer.parseInt(line);
            System.out.print(searchInsert(nums, target));
        }
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i=0; i<nums.length; i++)
            if (nums[i] >= target)
                return i;
        return nums.length;
    }
}