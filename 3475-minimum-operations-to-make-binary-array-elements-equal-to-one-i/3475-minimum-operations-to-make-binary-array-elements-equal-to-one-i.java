class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length-3;
        int cont = 0;
        for(int i = 0; i <=n ; i++){
            if (nums[i]==0){
                nums[i]=flip(nums[i]);
                nums[i+1]=flip(nums[i+1]);
                nums[i+2]=flip(nums[i+2]);
                cont++;
            }
        }
        for(int j =0; j<nums.length; j++){
            if(nums[j]==0){
                return -1;
            }
        }
        return cont;

    }
    public int flip(int a){
        if(a==1){
            return 0;
        }
        return 1 ;
    }
}