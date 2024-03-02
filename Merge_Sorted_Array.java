import java.util.Scanner;

public class Merge_Sorted_Array {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while(i>=0){
            nums1[k--] = nums1[i--];
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the size of the 1st array: ");
        int size_1 = sc.nextInt();
        int[] nums1 = new int[size_1];
        System.out.println("Enter the elements of first Array: ");
        for(int i=0; i<size_1; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter the first merging index: ");
        int m = sc.nextInt();

        System.out.println("Enter the size of the 2nd array: ");
        int size_2 = sc.nextInt();
        int[] nums2 = new int[size_2];
        System.out.println("Enter the elements of second Array: ");
        for(int i=0; i<size_2; i++){
            nums2[i] = sc.nextInt();
        }

        System.out.println("Enter the second merging index: ");
        int n = sc.nextInt();

        Merge_Sorted_Array merger = new Merge_Sorted_Array();
        merger.merge(nums1, m, nums2, n);

        System.out.println("Merged Array:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
