// Build Array from Permutation

public class buildArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            //int n = nums[i];
            ans[i] = nums[nums[i]];
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
