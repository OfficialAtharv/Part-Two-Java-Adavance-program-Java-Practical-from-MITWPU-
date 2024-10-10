class Q5{
  public static void main (String [] args){
    if(args.length!=1){
      System.out.println("Enter the digit to check the number is palidrome or not !");
    }
    System.out.println("Enter the digit to check the number is palidrome or not !");
    String number = args[0];
    String Reversed = new StringBuilder(number).reverse().toString();
    if(number.equals(Reversed)){
      System.out.println("The number is an Palindrom "+number);
    }
    else{
      System.out.println("The number is not anPalindrom "+number);
    }
  }
}