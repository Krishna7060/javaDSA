public class insertionSort {
    public static void main(String[] args) {
        int myArray[] ={5,7,9,4,8};
        for(int i=1; i<myArray.length; i++){
            int current = myArray[i]
            int j  =i-1;
            while (j>=0 && current<myArray[j]) {
                myArray[j+1]=myArray[j];
                j--;
                
            }
            myArray[j+1]=current;
        }
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
    
}
