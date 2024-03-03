import java.util.Scanner;

public class removeElement {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to remove from this array: ");
        int val = sc.nextInt();

        int newSize = removeElement(nums, val);

        System.out.println("Array after removing " + val + ":");
        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
