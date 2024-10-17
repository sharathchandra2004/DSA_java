public class largest_element {
    
    public static int LE(int arr[]){
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++) {

            if(arr[i]>largest){
                largest = arr[i];
            }            
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5 , 8 ,3, 10};
        System.out.println("The largest element "+LE(arr));
    }
}
