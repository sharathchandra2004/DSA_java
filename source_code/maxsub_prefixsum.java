public class maxsub_prefixsum{
    public static void maxsub_prefix(int arr[]){
        

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int currSum = 0;
                for (int k = start; k <=end; k++) {
                    currSum+=arr[k];                                
                }
                System.out.println(currSum);               
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxsub_prefix(arr);
    }
    
}