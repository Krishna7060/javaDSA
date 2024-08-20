public class recursion {

    public static int calculatePower(int x, int n){
        if(n==0){
            return 1;
        }

        if(x==0){
            return 0;
        }

       int nm1= calculatePower(x, n-1);
       int xpN =nm1*x;
       return xpN;
    }

    public static void main(String[] args) {
       int ans= calculatePower(2, 5);
       System.out.println(ans);
    }
}