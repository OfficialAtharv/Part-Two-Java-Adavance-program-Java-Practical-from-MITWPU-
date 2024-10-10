public class Q3{
  public static void main(String [] args){
    System.out.println("Program to get the smallest number in 3 given number :- ");
    if(args.length!=3){
      System.out.println("Please enter three numbers to compair ");
    }
    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]);
    int number3 = Integer.parseInt(args[2]);
     if(number1<number2 && number1 < number3){
        System.out.println("Number 1 : "+number1+ " is Smallest number in 3 numbers !");
     }
     else if (number2<number1 && number2<number3){
      System.out.println("Number 2 : "+number2+ " is Smallest number in 3 numbers !");
     }
     else if (number3<number1 && number3<number2){
      System.out.println("Number 3 : "+number3+ " is Smallest number in 3 numbers !");
     }
  }
}