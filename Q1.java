  class Q1 {
  public static void main(String []args){
  if(args.length!=3){
  System.out.println("Please enter the valid details two numbers and the operator ");
  return;
  }
  int num1=Integer.parseInt(args[0]);
  int num2=Integer.parseInt(args[1]);
  char operator= args[2].charAt(0);
  int result=0;
  switch(operator){
  case '+':
  result=num1+num2;
  break;
  case '-':
  result=num1-num2;
  break;
  case '*':
  result=num1*num2;
  break;
  case '/':
  if(num2==0){
  System.out.println("The number can not be divisible by 0");
  }
  result=num1/num2;
  break;
  }System.out.println("number 1 -" + num1 + " number 2 -" + num2 + " result is " + result);

  }
  }