public class Sorting {
    public static void main(String[] args) {
        int myArr[]={7,4,6,3,1};
        for(int i=0; i<myArr.length-1; i++){
            for(int j=0; j<myArr.length-1; j++){
                if(myArr[j]>myArr[j+1]){
                    int temp =myArr[j];
                    myArr[j]=myArr[j+1];
                    myArr[j+1]=temp;
                }
            }
            
        }

        for(int i=0; i<myArr.length; i++){
            System.out.println(myArr[i]);
        }

    }
    
}

