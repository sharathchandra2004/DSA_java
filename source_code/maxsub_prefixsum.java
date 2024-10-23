public class maxsub_prefixsum{

    public static void maxsub_prefix(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int idx = 1; idx < prefix.length; idx++) {
            prefix[idx] = prefix[idx-1] + arr[idx];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int currSum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];    
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum subarray is: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxsub_prefix(arr);
    }
    
}