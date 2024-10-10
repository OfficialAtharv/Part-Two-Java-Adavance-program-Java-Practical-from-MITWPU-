public class Q2{
  public static void main (String []args){
    if(args.length!=1){
      System.out.println("Enter the integer to print the multiplication table!! ");
    }
      int number = Integer.parseInt(args[0]);
      System.out.println("Table of " + number +" : ");
      for(int i =1;i<=10;i++){
        System.out.println(number + " * " + i + " = " + (number*i));
      }
   

  }
}