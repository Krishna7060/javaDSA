import string.string;

public class recursion {
    public static int first =-1;
    public static int last =-1;

     public static void findFirstLastOccurence(String str, int index,char element){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
        }
        char currentChar= str.charAt(index);
        if(currentChar==element) {
            if(first==-1){
                first=index;
            } else{
                last=index;
            }
        }

        findFirstLastOccurence(str,index+1,element);


     }
    

    public static void main(String[] args) {

        String str ="krishna";
    findFirstLastOccurence(str,0,'a');
        
        


        
    
    }
}