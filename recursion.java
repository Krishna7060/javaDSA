public class recursion {
     
     public static void printReverse(String str , int index ){
        
          if(index==0){
            System.out.println(str.charAt(index));
          }  
    
    
     System.out.print(str.charAt(index));
     printReverse(str, index-1);

     }

    public static void main(String[] args) {

        String str ="krishna";
        int index =str.length()-1;
        printReverse(str, index);
        


        
    
    }
}