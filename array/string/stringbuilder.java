package string;
import java.util.*;

public class stringbuilder {
    // About StringBuilder
    // StringBuilder is class in java used decalere a string by help of StringBuilde
    // we can mutate a string as we know we string are imutrable in java but the
    // help of StringBuilder we can mute strings easly it also save lot of time \



    // how decalre string by help string builder

    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("krishna");
        // str.charAt(3);
        // str.setCharAt(2, 'h');
        // str.insert(4, "x");
        // str.delete(0,1);
       // System.out.println(str);

       // Reverse a string 
       StringBuilder name =new StringBuilder("Krishna");
       for(int i=0; i<name.length()/2; i++){
        // calculating index of front and back
        int front =i;
        int back   = name.length()-1-i;
        char frontChar=name.charAt(front);
        char backchar = name.charAt(back);
        name.setCharAt(front, backchar);
        name.setCharAt(back, frontChar);
        System.out.println(name);
        
        

       }
    }
    
    


}
