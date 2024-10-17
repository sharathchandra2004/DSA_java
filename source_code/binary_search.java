public class binary_search {
    public static int BS(int arr[],int key){

        int start = 0 , end = arr.length-1;
       
        while(start<=end){
            int mid = (start+end)/2;

            if( arr[mid] == key ){
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
        System.out.println("index for the key is "+ BS(arr,1));
    }
    

}
