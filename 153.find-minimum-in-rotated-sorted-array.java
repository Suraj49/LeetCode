class Solution {
    public int findMin(int[] arr) {
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }
}