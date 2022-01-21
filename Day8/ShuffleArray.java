class ShuffleArray {
    public static void main(String[] args) {

    int[]  nums = {2,5,1,3,4,7};
    int n = 3;
    int[] ans = shuffle(nums, n);

    for(int i=0;i<nums.length;i++)
        System.out.print(ans[i]+" ");
    

    }

    static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                result[i] = nums[i/2];
            }
            else{
                result[i] = nums[n+i/2];
            }
        }
        return result;
    }
}
