class Solution {
    public int getSecondLargest(int[] arr) {
        int largest=-1;
        int s_largest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                s_largest=largest;
                largest=arr[i];
                
            }
            else if(arr[i]>s_largest && arr[i]<largest){
                s_largest=arr[i];
            }
        }
        return s_largest;
        
    }
}