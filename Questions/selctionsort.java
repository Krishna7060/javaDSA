public class selctionsort {
    public static void main(String[] args) {
        int myarr[] ={6,9,3,7,2};
        for(int i=0; i<myarr.length; i++){
            int smallest =i;
            for(int j=i+1; j<myarr.length; j++){
                if (myarr[smallest]>myarr[j]) {
                    smallest=j;
                    
                }
            }
            int temp =myarr[smallest];
            myarr[smallest]=myarr[i];
            myarr[i]=temp;
        }
        for(int i=0; i<myarr.length; i++){
            System.out.println(myarr[i]);
        }
    }
    
}
