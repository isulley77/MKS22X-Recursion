import java.util.ArrayList;

public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){

    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1
     *fib(5) = 5
     *precondition: n is non-negative
     */

    public static double checkSquare(double num, double guess, double off){

      if(num == 0){
        return 0.0;
      }
      if(Math.abs(num - (guess * guess) <= off)){
        return g;
      }
      else{
        guess = ((num / guess) + guess) / 2;
        return checkSquare(num, guess, off);
      }
    }
    public static int fib(int n){

    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
    }

  public static void main(String[] args){
    System.out.println(checkSquare(4, 1, .005));
  }
}
