public class Q4{
  public static void main(String [] args){
    if(args.length!=1){
      System.out.println("Please enter a digit to check the number is prime or not ");
    }
    int number = Integer.parseInt(args[0]);
      if(isPrime(number)){
        System.out.println("The entered number is "+ number+" an prime number");
      }
      else{
        System.out.println("The entered number is "+ number+" not an prime number");
      }
  }
public static boolean isPrime(int num) {
  if (num <= 1) {
      return false;
  }
  for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
          return false; 
      }
  }
  return true;
}
}