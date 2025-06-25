import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] nums1 = { 0 };
        int[] nums2 = { 1 };
        int m = 0;
        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for (int i = 0; i < n; i++) {

            nums1[m + i] = nums2[i];
        }    
        
        Arrays.sort(nums1);
        
    }
}