public class recursion {

    // public static void towerOfHonoi( int n,String src, String Helper,String Destination){
    //     if(n==1){
    //         System.out.println(n+"disk transpered" +src+ "to" +Destination);
    //         return;

    //     }
        
    //     towerOfHonoi(n-1, src, Destination, Helper);
    //     System.out.println(n+"disk transpered" +src+ "to" +Destination);
    //     towerOfHonoi(n-1, Helper, src, Destination);
    
        
    // }


    // reverse a string
    
    // public static void reverseString(String str, int index){

    //     if(index==0){
    //         System.out.println(str.charAt(index));
        
    //         return;
    //     }
    //       System.out.print(str.charAt(index));
    //     reverseString(str, index-1);
        
    // }

    public static void main(String[] args) {
        
        String str = "krishna";
        int index = str.length()-1;
    reverseString(str, index);

        
    
    }
}