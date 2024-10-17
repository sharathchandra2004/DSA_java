public class linear_search {
    
    public static  int LS(int arr[],int key){
        
        // loop to traverse the array and search the element in linear direction
        for(int i = 0;i < arr.length;i++){
            if (arr[i] == key){
                System.out.println("Element found at position "+ i);
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        LS(arr,5);
    }    
}
