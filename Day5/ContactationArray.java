class ContactationArray {
    public static void main(String[] args) {
        // int[] nums = {1,1214,34,23};
        // for (int var : getConcatenation(nums)) {
        //     System.out.println(nums[var]);
        // }
            
        }
    
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*(nums.length)];
        for(int i=0;i<(nums.length);i++){
            if(i<nums.length){
                ans[i] = nums[i];
                ans[i+nums.length] = nums[i];
            }
        }
        return ans;
        
    }
}