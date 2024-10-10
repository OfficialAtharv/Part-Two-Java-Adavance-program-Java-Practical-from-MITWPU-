import java.util.Arrays;
class Q8{
    public static void main (String []args){
    if(args.length!=5){
        System.out.println("Please enter 5 digits to get the ascending order !");
    }
  
    int []numbers=new int[5];
    for(int i=0;i<5;i++){
        numbers[i]=Integer.parseInt(args[i]);
    }
    Arrays.sort(numbers);
      for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}