//  Running Sum of 1d Array
class SumofArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,56};
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    
}