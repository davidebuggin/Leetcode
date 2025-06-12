public class RemoveDuplicatesfromSortedArray {
    public static void main (String[] args){

        int [] nums = {};
        System.out.println(removeSuplicates(nums));

    }
    
    public static int removeSuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        
        int k = 1;

        for(int i = 1; i < nums.length; i++){
            if (nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}


