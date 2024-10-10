class staff{
    String Name;
    String birthdate; 
    String designation; 
    float salary ; 
    public staff(String Name ,String birthdate , String designation , float salary){
        this.Name=Name;
        this.birthdate=birthdate;
        this.designation=designation;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Name of the staff member is " + Name + " , birth date is " + birthdate + " , designantion is " + designation + "and salary is " + salary );
    }
    public static void main(String args[]){
        staff obj = new staff ("Atharv Kukarni","21-07-2003","Front-end Developer",300000);
        staff obj2 = new staff ("Arun Kulkarni","10-09-1967","Contractor",900000);
        if(obj.salary>obj2.salary){
              System.out.println("Staff 1 has the higher salary the details are as follows ");
             obj.display();
        }
        else{
            System.out.println("Staff 2 has the higher salary the details are as follows ");
            obj2.display();
        }

    }
}
 