public class binary_search {
    public static int BS(int arr[],int key){
        int start = 0 , end = arr.length;
        int mid = (start+end)/2;
        for (int i = 0; i < arr.length; i++) {

            if(key == arr[mid] ){
                return mid;
            }
            if(key<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }            
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        BS(arr,5);
    }
    

}
