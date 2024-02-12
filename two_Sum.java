import java.util.*;

public class two_Sum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int x = target - cur;
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }
            map.put(cur, i);
        }
        // If no solution found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        int[] result = twoSum(arr, target);
        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
