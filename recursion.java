public class recursion {
    // print nunbers 1 to 5
    // public static void printNum(int n){
    // if(n==6){
    // return;
    // } else{
    // System.out.println(n);
    // printNum(n+1);
    // }
    // }

    // print the sum of first natural number
    public static void printSum(int i, int sum, int n) {

        if (i == n) {
            sum += i;
            System.out.println(sum);
        }

        else {
            sum += i;

            printSum(i + 1, sum, n);
        }

    }

    public static void main(String[] args) {
        printSum(1, 0, 10);

    }
}
