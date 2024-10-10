class Q11_class{
public static void main (String []args){
    if(args.length!=1){
        System.out.println("please enter th valid input");
    }
    int roll_no = Integer.parseInt(args[0]);
    String Name = args[1];
    float percentage = Float.parseFloat(args[2]);
    System.out.println("The details are as follow ");
    System.out.println(roll_no);
    System.out.println(Name);
    System.out.println(percentage);
}
}