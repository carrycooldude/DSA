class GoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int n = numIdenticalPairs(arr);
        System.out.println(n);
        
    }
    public static int numIdenticalPairs(int[] nums) {
        int counter =0;
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    counter += 1;
                }
            }
        }
        return counter;
        
        
    }
}