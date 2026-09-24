class Solution {
    void segregate0and1(int[] arr) {
        int left=0;
        int n=arr.length;
        int right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                arr[left]=0;
                arr[right]=1;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
        
        
        
        
    }
}
