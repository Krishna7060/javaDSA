public class recursion {

    public static boolean isArrSorted(int[] arr, int index){
        if(index==arr.length-1){
            System.out.println("array is sorted");
            
            return true;
        }
        if(arr[index]<arr[index+1]){
            return isArrSorted(arr, index+1);
        } else{
            System.out.println("array is unsorted");
            return false;
        }
    }

    public static void main(String[] args) {

        int [] arr ={2,3,4,8};
        isArrSorted(arr, 0);
        
    }
}